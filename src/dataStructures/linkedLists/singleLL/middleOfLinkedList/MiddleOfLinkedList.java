package dataStructures.linkedLists.singleLL.middleOfLinkedList;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        //Given a singly linked list, the task is to find the middle of the linked list.
        // If the number of nodes are even, then there would be two middle nodes,
        // so return the second middle node.

        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(getMiddle(head));
    }

    // Function to get the middle of the linked list
    // Time: O(n)
    // Space: O(1)
    static int getMiddle(Node head) {
        // both start on head
        Node slow = head;
        Node fast = head;

        // When fast reaches the end of the list (because it goes next.next
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // then slow will be at the middle
        return slow.data;
    }

    // Time: O(n)
    // Space: O(n)
    static int getMiddleBad(Node head) {
        List<Node> nodes = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            nodes.add(temp);
            temp = temp.next;
        }
        return nodes.get((nodes.size() / 2)).data;
    }
}
