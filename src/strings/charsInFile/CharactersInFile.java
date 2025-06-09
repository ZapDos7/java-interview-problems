package strings.charsInFile;

import java.util.List;
import utils.InputReader;

// Goal: Write a program to find out how many times two given characters appear in any text file.
public class CharactersInFile {
    public static void main(String[] args){
        System.out.print("Provide character 1: ");
        char c1 = InputReader.readLine().charAt(0);
        System.out.print("Provide character 2: ");
        char c2 = InputReader.readLine().charAt(0);

        List<String> fileLines = InputReader.readFile("sample.txt");

        int n1 = 0;
        int n2 = 0;

        for (String s : fileLines) {
            n1 += countCharsInString(c1, s);
            n2 += countCharsInString(c2, s);
        }

        System.out.println("Character " + c1 + " appears " + n1 + " times in file.");
        System.out.println("Character " + c2 + " appears " + n2 + " times in file.");
    }

    private static int countCharsInString(char c, String s) {
        return (int) s.chars().filter(ch -> ch == c).count();
    }
}
