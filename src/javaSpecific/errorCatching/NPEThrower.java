package javaSpecific.errorCatching;

public class NPEThrower {
    public static void main(String[] args) {
        String s1 = null;
        System.out.println(s1.length()); // s1 is null, so s1.length throws NPE
    }
}
