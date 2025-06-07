package swapNums;

import utils.InputReader;

public class NumberSwapper {
    public static void main(String[] args){
        System.out.print("Write number #1 to swap: ");
        int n1 = InputReader.readInt();
        System.out.print("Write number #2 to swap: ");
        int n2 = InputReader.readInt();

        System.out.println("Before the switcheroo: " + n1 + " & " + n2);
        //
        int middleman = n2;
        n2 = n1;
        n1 = middleman;

        System.out.println("After the switcheroo: " + n1 + " & " + n2);
    }


}
