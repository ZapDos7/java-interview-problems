package strings.circularMoves;

import utils.InputReader;

public class CircularMoves {

    static int x = 0;
    static int y = 0;
    static Direction direction = Direction.N; // start looking at north

    public static void main(String[] args) {
        // input
        System.out.print("Print set of moves: M for same direction, L for left, R for right: ");
        String moves = InputReader.readLine();

        // validate input
        if (!moves.matches("^[LMR]*$\n")) {
            System.err.println("Invalid input");
        }

        // check
        if (isCircular(moves.toUpperCase().trim())) {
            System.out.println("Set of moves " + moves + " is circular");
        } else {
            System.out.println("Set of moves " + moves + " is NOT circular");
        }
    }

    // start at 0,0, facing UP
    private static boolean isCircular(String moves) {
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'L':
//                    System.out.println("going Left");
                    if (direction.equals(Direction.N)) {
                        direction = Direction.W;
                    } else if (direction.equals(Direction.W)) {
                        direction = Direction.S;
                    } else if (direction.equals(Direction.S)) {
                        direction = Direction.E;
                    } else if (direction.equals(Direction.E)) {
                        direction = Direction.N;
                    }
                    break;
                case 'R':
//                    System.out.println("going right");
                    if (direction.equals(Direction.N)) {
                        direction = Direction.E;
                    } else if (direction.equals(Direction.E)) {
                        direction = Direction.S;
                    } else if (direction.equals(Direction.S)) {
                        direction = Direction.W;
                    } else if (direction.equals(Direction.W)) {
                        direction = Direction.N;
                    }
                    break;
                case 'M':
//                    System.out.println("going forward");
                    if (direction.equals(Direction.N)) {
                        y++;
                    } else if (direction.equals(Direction.S)) {
                        y--;
                    } else if (direction.equals(Direction.E)) {
                        x++;
                    } else if (direction.equals(Direction.W)) {
                        x--;
                    }
                    break;
                default: // will never reach here
                    System.err.println("Invalid set of moves");
            }
        }
        return (x == 0 && y == 0); // if eventually we're back at 0,0, it is circular
    }

    private enum Direction {
        N, E, S, W;
    }
}
