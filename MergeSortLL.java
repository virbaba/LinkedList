import java.util.*;
import java.io.*;

/**********************************************************************
 * 
 * Following is the class structure of the Node class for reference:
 * 
 * class Node{
 * public int data;
 * public Node next;
 * 
 * Node(int data){
 * this.data = data;
 * this.next = null;
 * }
 * }
 * 
 *********************************************************************/

public class Solution {
	public static Node sortLL(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: Return head if list has 0 or 1 element
        }

        // Find the middle of the list
        Node middle = findMiddle(head);
        Node nextToMiddle = middle.next;
        middle.next = null; // Break the list into two halves

        // Recursively sort the two halves
        Node leftSorted = sortLL(head);
        Node rightSorted = sortLL(nextToMiddle);

        // Merge the sorted halves
        return merge(leftSorted, rightSorted);
    }

    // Function to find the middle of the list using slow and fast pointers
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to merge two sorted lists
    public static Node merge(Node left, Node right) {
        Node dummy = new Node(0); // Dummy node to simplify merging
        Node current = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        // Connect remaining nodes, if any
        if (left != null) {
            current.next = left;
        }
        if (right != null) {
            current.next = right;
        }

        return dummy.next; // Return the merged sorted list
    }

	
}
