import java.util.*;

import java.io.*;

/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class LinkedListNode {
 * int data;
 * LinkedListNode next;
 * 
 * public LinkedListNode(int data) {
 * this.data = data;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode head3 = null;
        LinkedListNode temp = null;
        int c = 0;

        while (head1 != null && head2 != null) {
            int sum = c + head1.data + head2.data;
            c = sum / 10;
            int data = sum % 10;
            LinkedListNode newNode = new LinkedListNode(data);
            if (head3 == null) {
                head3 = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        while (head1 != null) {
            int sum = c + head1.data;
            c = sum / 10;
            int data = sum % 10;
            LinkedListNode newNode = new LinkedListNode(data);
            if (head3 == null) {
                head3 = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
            head1 = head1.next;
        }

        while (head2 != null) {
            int sum = c + head2.data;
            c = sum / 10;
            int data = sum % 10;
            LinkedListNode newNode = new LinkedListNode(data);
            if (head3 == null) {
                head3 = newNode;
                temp = newNode;
            }

            else {
                temp.next = newNode;
                temp = newNode;
            }
            head2 = head2.next;
        }

        if (c != 0) {
            LinkedListNode newNode = new LinkedListNode(c);
            temp.next = newNode;
            temp = newNode;
        }

        return head3;

    }
}
