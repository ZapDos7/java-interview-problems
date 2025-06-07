package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader {
    public static String readLine() {
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String s = null;
        try {
            s = r.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Printing the read line
        return s;
    }

    public static Double readDouble() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static Integer readInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
