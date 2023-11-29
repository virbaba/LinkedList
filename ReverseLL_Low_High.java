public class Solution {
    public static Node reverseLL(Node head, int low, int high) {
        // Write your code here.
        Node leftTail = null;
        Node rightHead = null;

        Node start = head;
        Node end = null;

        while (low != 1) {
            leftTail = start;
            start = start.next;
            low--;
        }

        end = head;
        while (high != 1 && end.next != null) {
            end = end.next;
            high--;
        }

        rightHead = end.next;

        Node pre = null;
        Node curr = start;
        Node next = null;

        while (curr != rightHead) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        if (leftTail == null) {
            head = pre;
        }
        else{
            leftTail.next = pre;
        }

        
        start.next = rightHead;

        return head;
    }
}
