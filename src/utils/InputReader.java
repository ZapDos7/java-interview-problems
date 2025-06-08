package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

    public static List<String> readFile(String filename) {
        List<String> content = new ArrayList<>();
        try {
            // Load file from classpath (resources folder)
            InputStream inputStream = InputReader.class.getClassLoader().getResourceAsStream(filename);
            if (inputStream == null) {
                throw new FileNotFoundException("Resource not found: " + filename);
            }

            Scanner myReader = new Scanner(inputStream);
            while (myReader.hasNextLine()) {
                content.add(myReader.nextLine());
            }
            myReader.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        return content;
    }
}
