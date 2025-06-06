package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    public static String read() {
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
}
