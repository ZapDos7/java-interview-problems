package stackMachine;

import utils.InputReader;

import java.util.Stack;

public class StackMachine {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String input = "";
        System.out.println("Enter virtual machine commands:");
        while (!input.equals("end")) { //
            input = InputReader.readLine();
            execute(input, stack);
            // System.out.println("Stack now: " + stack);
        }
    }

    private static void execute(String input, Stack<Integer> stack) {
        char command = input.charAt(0);
        int value1, value2;
        switch(command) {
            case 'P': // P - add value to stack
                try {
                    int num = Integer.parseInt(input.substring(2).trim());
                    stack.push(num);
                    System.out.println("Pushed: " + stack.peek());
                } catch (Exception e) {
                    System.out.println("Invalid input. Usage: P <number>");
                }
                break;
            case 'R': // R - current value at the top of the stack
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty. Please push a number");
                } else {
                    System.out.println("Result: " + stack.peek());
                    stack.pop();
                }
                break;
            case 'A': // A - remove top 2 values from stack, add values & push the result
                if (stack.size() < 2) {
                    System.out.println("Need at least 2 values in the stack for addition.");
                    break;
                }
                value1 = stack.pop();
                value2 = stack.pop();
                stack.push(value1 + value2);
                break;
            case 'S': // S - remove top 2 values from stack, subtract value2 from value1 & push the result
                if (stack.size() < 2) {
                    System.out.println("Need at least 2 values in the stack for subtraction.");
                    break;
                }
                value1 = stack.pop();
                value2 = stack.pop();
                stack.push(value2 - value1);
                break;
            case 'M': // M - remove top 2 values from stack, multiply values & push the result
                if (stack.size() < 2) {
                    System.out.println("Need at least 2 values in the stack for multiplication.");
                    break;
                }
                value1 = stack.pop();
                value2 = stack.pop();
                stack.push(value1 * value2);
                break;
            case 'D': // D - remove top 2 values from stack, divide value2 from value1 & push the result
                if (stack.size() < 2) {
                    System.out.println("Need at least 2 values in the stack for division.");
                    break;
                }
                value1 = stack.pop();
                value2 = stack.pop();
                if (value1 == 0) {
                    System.out.println("Error: Division by zero.");
                    stack.push(value2); // Push back the original values
                    stack.push(value1);
                    break;
                }
                stack.push(value2 / value1);
                break;
            default:
                System.out.println("Exiting program.");
        }
    }
}

/*
* Enter virtual machine commands:
P 1
P 2
A
P 3
M
P 1
S
P 2
D
R
=> 4
* */

/*
* Enter virtual machine commands:
P 1
P 2
P 3
P 4
P 5
M
A
P 6
S
A
A
P 10
D
R
=> 2
* */