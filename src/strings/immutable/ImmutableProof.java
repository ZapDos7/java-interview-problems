package strings.immutable;

public class ImmutableProof {
    public static void main(String[] args) {
        String s1 = "this is a string";
        String s2 = s1;
        // s1, s2 same reference
        System.out.println("[BEFORE] S1:   " + s1);
        System.out.println("[BEFORE] S2:   " + s2);
        System.out.println("[BEFORE] Same? " + s1.equals(s2));

        // Update s1 value
        s1 = "this is another string";
        // s2 still holds original value

        System.out.println("[AFTER]  S1:   " + s1);
        System.out.println("[AFTER]  S2:   " + s2);
        System.out.println("[AFTER]  Same? " + s1.equals(s2));
    }
}
