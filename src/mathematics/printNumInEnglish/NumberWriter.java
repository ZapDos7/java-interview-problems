package mathematics.printNumInEnglish;

import utils.InputReader;

public class NumberWriter {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        int num = InputReader.readInt();
        System.out.print(toEnglish(num));
    }

    private static String toEnglish(int num) {
        if (num == 0) {
            return "Zero";
        }

        // divide to hundreds, thousands etc
        String padded = String.format("%010d", num); // add leading 0s
        int billions = Integer.parseInt(padded.substring(0, 1));
        int millions = Integer.parseInt(padded.substring(1, 4));
        int thousands = Integer.parseInt(padded.substring(4, 7));
        int hundreds = Integer.parseInt(padded.substring(7, 10));

        StringBuilder builder = new StringBuilder();

        if (billions > 0) {
            builder.append(convertHundreds(billions)).append(" Billion ");
        }
        if (millions > 0) {
            builder.append(convertHundreds(millions)).append(" Million ");
        }
        if (thousands > 0) {
            builder.append(convertHundreds(thousands)).append(" Thousand ");
        }
        if (hundreds > 0 || builder.isEmpty()) { // if all others were 0
            builder.append(convertHundreds(hundreds));
        }

        return builder.toString().trim();
    }

    private static String convertHundreds(int num) {
        StringBuilder result = new StringBuilder();

        int hundred = num / 100;
        int rest = num % 100;

        if (hundred > 0) {
            result.append(fromSmallNumber(hundred)).append(" Hundred");
            if (rest > 0) {
                result.append(" ");
            }
        }

        if (rest > 0) {
            if (rest < 20) {
                result.append(fromSmallNumber(rest));
            } else {
                int tens = (rest / 10) * 10;
                int units = rest % 10;
                result.append(fromSmallNumber(tens));
                if (units > 0) {
                    result.append(" ").append(fromSmallNumber(units));
                }
            }
        }

        return result.toString();
    }


    private static String fromSmallNumber(int n) {
        return switch (n) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            case 11 -> "Eleven";
            case 12 -> "Twelve";
            case 13 -> "Thirteen";
            case 14 -> "Fourteen";
            case 15 -> "Fifteen";
            case 16 -> "Sixteen";
            case 17 -> "Seventeen";
            case 18 -> "Eighteen";
            case 19 -> "Nineteen";
            case 20 -> "Twenty";
            case 30 -> "Thirty";
            case 40 -> "Forty";
            case 50 -> "Fifty";
            case 60 -> "Sixty";
            case 70 -> "Seventy";
            case 80 -> "Eighty";
            case 90 -> "Ninety";
            default -> "";
        };
    }
}