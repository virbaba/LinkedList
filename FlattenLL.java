/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * public Node child;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * this.child = null;
 * }
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * this.child = null;
 * }
 * Node(int data, Node next, Node child)
 * {
 * this.data = data;
 * this.next = next;
 * this.child = child;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    public static Node merge(Node first, Node second) {
		// If the first is null return second
		if (first == null) {
			return second;
		}

		// If the second is null return first
		if (second == null) {
			return first;
		}

		Node merged;

		if (first.data < second.data) {
			merged = first;
			merged.child = merge(first.child, second);
		} else {
			merged = second;
			merged.child = merge(first, second.child);
		}
		return merged;
	}

    public static Node flattenLinkedList(Node head) {
        // Write your code here

       if (head == null || head.next == null) {
			return head;
		}

		// Recur on next node
		head.next = flattenLinkedList(head.next);

		// Merge with the current
		head = merge(head, head.next);

		return head;

    }
}
