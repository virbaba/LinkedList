import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
		if (head == null || head.next == null) {
            return true;
        }

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        Stack<Integer> stack = new Stack<>();

        // Move fast pointer to the end and slow to the middle
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the list has odd number of elements, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        // Compare second half with elements popped from the stack
        while (slow != null) {
            int top = stack.pop();
            if (top != slow.data) {
                return false;
            }
            slow = slow.next;
        }

        return true;

	}
}
