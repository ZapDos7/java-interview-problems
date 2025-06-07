package recursion.factorial;

public class Factorial {
    public static void main(String[] args) {
        int input = 3;
        int result = factorial(input);
        System.out.println(input + "! = " + result);
    }

    private static int factorial(int input) {
        if (input == 0 || input == 1) {
            return 1;
        }
        return input * factorial(input-1);
    }
}
