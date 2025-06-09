package javaSpecific.functionalInterface;

public class FIRunner {
    public static void main(String[] args) {
        TestFunctionalInterface fi = (String s) -> System.out.println(s.toUpperCase());
        fi.printUpper("abcDeF");
    }
}
