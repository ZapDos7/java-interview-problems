package binary.letters;

public class UpperLowercaseSwapper {
    public static void main(String[] args) {
        // to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ')); // OR space
        }
        System.out.println();
        // to uppercase
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char) (ch & '_')); // AND underscore
        }

        /* Why does this work?
        * Character	ASCII (Decimal)	ASCII (Binary)  Changes
            'A'	    65	            01000001
            'a'	    97	            01100001        'A' → 'a' adds 32 → sets bit 5 (counting from 0)
            ' '	    32	            00100000        OR'ing with space sets bit 5, XOR'ing with space flips bit 5 so swaps the case
            '_'	    95	            01011111        AND'ing with underscore clears bit 5
        * */

        System.out.println();
        System.out.println();
        // to invert
        // lowercase uppercase
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char) (ch ^ ' ')); // XOR space
        }
        System.out.println();
        // same for uppercase to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch ^ ' ')); // XOR space
        }

        System.out.println();
        System.out.println();
        // find letter's position in alphabet - AND 31
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " is in alphabet index " + (ch & 31)); // AND 31 (00011111)
        }
    }
}
