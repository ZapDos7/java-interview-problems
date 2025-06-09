package javaSpecific.multilabelSwitchCase;

import utils.InputReader;

public class Showcaser {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int choice = InputReader.readInt();
        int x = switch (choice) {
            case 1, 2, 3:
                yield choice;
            default:
                yield -1;
        };
        System.out.println("x = " + x);

        ////////////////////////////

        System.out.print("Input day initials: ");
        String day = InputReader.readLine();
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";

            default -> { // also use lambdas
                if (day.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a Sunday.";
            }
        };

        System.out.println(result);
    }
}
