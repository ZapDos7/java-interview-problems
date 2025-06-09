package javaSpecific.functionalInterface;

@FunctionalInterface

interface TestFunctionalInterface {
    void printUpper(String s);
}

/*
* Any interface with a SAM(Single Abstract Method) is a functional interface,
* and its implementation may be treated as lambda expressions.
* */