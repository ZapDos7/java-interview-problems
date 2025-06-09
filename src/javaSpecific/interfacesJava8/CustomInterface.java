package javaSpecific.interfacesJava8;

public interface CustomInterface {
    // regular abstract method
    void method1(String str);

    // default
    default void log(String str) {
        System.out.println("String::" + str);
    }

    // static
    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null || (str.isEmpty());
    }
}
