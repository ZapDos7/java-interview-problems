package pushUps;

import utils.InputReader;

public class Blaze {
    public static void main(String[] args) {
        System.out.print("Enter the final score: ");
        int finalScore = Integer.parseInt(InputReader.read());

        int totalPushUps = 0;

        // 1 touchdown    --> score = 7     --> push ups = 7
        // 2 touchdowns   --> score = 14    --> push ups = 14
        // x touchdowns   --> score = 35    --> push ups = 105
        // y touchdowns   --> score = 42    --> push ups = 147
        for (int score = 7; score <= finalScore; score += 7) {
            totalPushUps += score;
        }

        System.out.println("Total push-ups Blaze did: " + totalPushUps);
    }
}
