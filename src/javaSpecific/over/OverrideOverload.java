package javaSpecific.over;

public class OverrideOverload {
    public static void main(String[] args) {
        System.out.println("Overload example: ");
        Example e = new Example();
        e.print();
        e.print("some string");

        System.out.println("\nOverride example: ");
        String t = "string";
        Parent p = new Parent();
        p.print(t);
        Child c = new Child();
        c.print(t);
    }

    // When a class has two or more methods with the same name, they are called overloaded methods.
    protected static class Example {
        public void print() {
            System.out.println("Example");
        }

        public void print(String s) {
            System.out.println(s);
        }
    }

    // When a superclass method is also implemented in the child class, it’s called overriding.
    protected static class Parent {
        public void print(String string) {
            System.out.println("Base:  " + string);
        }
    }

    protected static class Child extends Parent {
        @Override
        public void print(String string) {
            System.out.println("Child: " + string);
        }
    }
}
