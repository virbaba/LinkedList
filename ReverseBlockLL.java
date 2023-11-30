import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/

public class Solution {
	public static Node kReverse(Node head, int i, int[] b) {
        // Write your code here.
		if (head == null || i >= b.length) {
            return head;
        }

        int count = b[i];
        if (count == 0) {
            // If block size is 0, move to the next block
            return kReverse(head, i + 1, b);
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        // Reverse 'count' nodes
        while (count > 0 && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count--;
        }

        // If there are remaining nodes, recursively reverse next blocks
        if (next != null) {
            head.next = kReverse(next, i + 1, b);
        }

        return prev;

    }
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		// Write your code here.
		return kReverse(head, 0, b);
	}
}
