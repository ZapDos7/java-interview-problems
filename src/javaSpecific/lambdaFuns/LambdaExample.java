package javaSpecific.lambdaFuns;

import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda:
        // (parameter1, parameter2, ...) -> { code or expression }
        List<String> numbers = List.of("string", "test", "example", "fooBar");
        numbers.forEach( (n) -> { System.out.println(n.toUpperCase()); } );
    }
}
