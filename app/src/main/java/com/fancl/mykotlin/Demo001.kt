import com.fancl.mykotlin.Country

class Book(var name: String) {

    fun printName() {
        print(this.name)
    }
}

fun main(args: Array<String>) {
    val x = intArrayOf(1, 2, 3)
    x[0] = 2
    print(x[0])
    println()
    val book = Book("thinking in java")
    book.name = "Diving into Kotlin"
    book.printName()
    println()

    val books = mutableListOf(
        Book("think in java"),
        Book("Dive into kotlin"),
        Book("hahaha")
    ).map(Book::name)

    println(books)

    println()
    var list = mutableListOf<Int>(1, 2)
    print(cal(list))
    println()
    print(cal1(list))
    println()
    foo(10)
    println()

    var test = CountryTest()
    var filterCount = CountryApp()

    var listCountrys = filterCount.filterCountries(
        mutableListOf<Country>(
            Country("南非", "er", 10000),
            Country("埃及", "ru", 200),
            Country("美国", "EU", 20000)
        ),
        test::isBigEuropeanCountry
    ).map(Country::name)

    println(listCountrys)

    var list2Countrys = filterCount.filterCountries(mutableListOf(
        Country("南非", "er", 10000),
        Country("埃及", "ru", 200),
        Country("美国", "EU", 20000)
    ),
        fun(country: Country): Boolean {
            return country.continient == "EU" && country.population > 10000
        }

    ).map(Country::name)
    println(list2Countrys)

    var list3Countrys = filterCount.filterCountries(mutableListOf(
        Country("南非", "er", 10000),
        Country("埃及", "ru", 200),
        Country("美国", "EU", 20000)
    ),
        { country ->
            country.continient == "EU" && country.population > 10000
        }

    ).map(Country::population)
    println(list3Countrys)

    println(sum1(1,3))
    println(sum2(1,3))

    println()
    var cal= Cal()
    listOf<Int>(1,2,3).forEach(cal::foo2)

    println()
    listOf<Int>(1,2,3,4,5).forEach {
        foo2(it)()
    }
}

fun cal(list: List<Int>): Int {
    var res = 0
    for (it in list) {
        res *= it
        res += it
    }
    return res
}

fun cal1(list: List<Int>): Int {
    return list.fold(0) { res, el ->
        res * el + el
    }


}


fun foo(x: Int) {

    fun double(y: Int): Int {
        return y * 2
    }

    print(double(x))
}


class CountryApp {
    fun filterCountries(countries: List<Country>): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continient == "EU") {
                res.add(c)
            }
        }
        return res
    }

    fun filterCountries(countries: List<Country>, continient: String): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continient == continient) {
                res.add(c)
            }
        }
        return res
    }

    fun filterCountries(
        countries: List<Country>, continient: String,
        population: Int
    ): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continient == continient && c.population > population) {
                res.add(c)
            }
        }
        return res
    }


    fun filterCountries(countries: List<Country>, test: (Country) -> Boolean): List<Country> {
        var res = mutableListOf<Country>()
        for (c in countries) {
            if (test(c))
                res.add(c)
        }
        return res
    }


}

class CountryTest {
    fun isBigEuropeanCountry(country: Country): Boolean {
        return country.continient == "EU" && country.population > 10000
    }
}

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

val sum1 = { x: Int, y: Int -> x + y }

val sum2: (Int, Int) -> Int = { x, y -> x + y }


class  Cal{
    fun foo2(int:Int):Unit{
        print("结果$int")
    }
}

fun foo2(int:Int)={
    print("结果$int")
}
