/*
  Time Complexity : O(N)
  Space Complextiy : O(1)
*/
public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                break;
        }

        if(fast == null || fast.next == null)
            return null;
        
        while(head != slow){
            head = head.next;
            slow = slow.next;
        }

        return head;

        
    }
}
