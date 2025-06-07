package strings.duplicateWords;

import java.util.Arrays;
import java.util.List;

public class UniqueWords {
    public static void main(String[] args){
//        String input = "This is a test phrase containing no duplicate words";
        String input = "This is a test duplicate phrase containing duplicate words";

        // Result: print unique words in string
        List<String> uniques = Arrays.stream(input.split(" ")).distinct().toList();
        System.out.println(uniques);
    }
}
