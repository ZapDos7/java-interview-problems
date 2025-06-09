package javaSpecific.errorCatching;

import java.io.IOException;
import java.time.Instant;
import java.util.Random;

public class TryCatch {
    public static void main(String[] args) {
        Random random = new Random(Instant.now().getEpochSecond());
        try { // throw an exception randomly
            int n = Math.abs(random.nextInt() % 10);
            System.out.println("N = " + n);
            if (n < 3) {
                throw new IOException();
            } else if (n > 5) {
                throw new NoSuchFieldException();
            } else {
                throw new NoSuchMethodException();
            }
        } catch (IOException e) { // catch one exception
            System.err.println("IO exception");
        } catch (NoSuchFieldException | NoSuchMethodException e) { // catch multiple exceptions
            System.err.println("Field or method exception");
        }
    }
}
