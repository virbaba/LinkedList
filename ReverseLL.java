import java.io.*;
import java.util.* ;


public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode<Integer> pre = null;
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}

		return pre;
    }
}
