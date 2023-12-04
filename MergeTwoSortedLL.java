import java.io.*;
import java.util.*;

/************************************************************
TIME COMPLEXITY : O(N)
SPACE COMPLEXITY : O(1)
 ************************************************************/

public class Solution {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Write your code here.
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> temp = null;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                if (head == null) {
                    head = first;
                    temp = first;
                } else {
                    temp.next = first;
                    temp = first;
                }
                first = first.next;
            } else {
                if (head == null) {
                    head = second;
                    temp = second;
                } else {
                    temp.next = second;
                    temp = second;
                }
                second = second.next;
            }
        }

        while (first != null) {
            if (head == null) {
                head = first;
                temp = first;
            } else {
                temp.next = first;
                temp = first;
            }
            first = first.next;
        }

        while (second != null) {
            if (head == null) {
                head = second;
                temp = second;
            } else {
                temp.next = second;
                temp = second;
            }
            second = second.next;
        }

        temp.next = null;

        return head;
    }
}
