package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

// The idea is to simulate LIFO (Last In First Out) behavior using FIFO (First In First Out) data structures.
// Below implementation is costly when popping, not pushing
public class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>(); // main queue where push ops go
    private Queue<Integer> q2 = new LinkedList<>(); // during pop/top, move all but last element here so we process the remaining one, then swap so q1 is again the main one

    // Push element onto stack
    public void push(int x) {
        q1.add(x);
    }

    // Removes the element on top of the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except the last from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Last element left in q1 is the top of the stack
        int top = q1.remove();

        // Swap q1 and q2 so q1 is always the main queue
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Get the top element
    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove();
        q2.add(top);

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Return whether the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // For testing
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.top()); // 20
        System.out.println(stack.pop()); // 20
        System.out.println(stack.top()); // 10
        stack.push(30);
        System.out.println(stack.pop()); // 30
    }
}
