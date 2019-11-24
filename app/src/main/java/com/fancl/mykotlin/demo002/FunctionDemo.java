package com.fancl.mykotlin.demo002;

public class FunctionDemo {

    public static void main(final String[] args) {
        Function<String, Integer> stringIntegerFunction
                = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        int result =stringIntegerFunction.apply("helloword").intValue();
        System.out.println(result);
    }
}
