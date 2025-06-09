package dataStructures.stack.parenthesesCheck;

import java.util.List;
import java.util.Stack;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 * */
public class ParenthesesChecker {
    public static void main(String[] args) {
        List<String> inputs = List.of("()", "{{{)))", "()[]{}", "{]", "[{()}]");
        for (String s : inputs) {
            if (isValid(s)) {
                System.out.println(s + " is valid");
            } else {
                System.out.println(s + " is NOT valid");
            }
        }
    }

    private static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') { // opening brackets --> push to stack
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') { // closing brackets, let's find their partners
                if (stack.isEmpty()) { // by default wrong
                    return false;
                } else {
                    char top = stack.peek();
                    if ((ch == ')' && top != '(')
                            || (ch == '}' && top != '{')
                            || (ch == ']' && top != '[')) {
                        return false;
                    }
                    stack.pop(); // pop if matched
                }
            } else {
                System.err.println("Unexpected input...");
            }
        }
        return stack.isEmpty(); // Valid only if all brackets matched
    }
}
