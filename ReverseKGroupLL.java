/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * };
 * 
 *****************************************************************/

public class Solution {
    public static Node kReverse(Node head, int k) {
        // Write your code here.
        if (head == null)
            return head;

        int count = k;
        Node pre = null;
        Node curr = head;
        Node next = null;

        while (count != 0 && curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
            count--;
           
        }

        if (count > 0) {
            curr = pre;
            pre = null;
            next = null;

            while (curr != null) {
                next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }
            return pre;

        }

        head.next = kReverse(curr, k);

        return pre;

    }
}
