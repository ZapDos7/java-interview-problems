package binary.swapNums;

import utils.InputReader;

public class NumberSwapper {
    public static void main(String[] args){
        System.out.print("Write number #1 to swap: ");
        int n1 = InputReader.readInt();
        System.out.print("Write number #2 to swap: ");
        int n2 = InputReader.readInt();

        System.out.println("Before the switcheroo: " + n1 + " & " + n2);
        // Easy: use a third variable
//        int middleman = n2;
//        n2 = n1;
//        n1 = middleman;
        // More tricky: do not use a third variable (XOR)
        n1 = n1 ^ n2; //[a = n1, b = n2] Store the Bitwise XOR of a and b in a. Now, a holds the result of (a ^ b).
        n2 = n1 ^ n2; //Bitwise XOR the new value of a with b to get the original value of a. This gives us, b = (a ^ b) ^ b = a.
        n1 = n1 ^ n2; //Bitwise XOR the new value of a with the new value of b (which is the original a) to get the original value of b. This gives us, a = (a ^ b) ^ a = b.

        System.out.println("After the switcheroo: " + n1 + " & " + n2);
    }


}
