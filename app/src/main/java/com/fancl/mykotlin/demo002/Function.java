package com.fancl.mykotlin.demo002;

public interface Function<Arg, Return> {

    Return apply(Arg arg);
}
