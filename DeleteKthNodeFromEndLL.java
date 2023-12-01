

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        Node fast = head;
        while(K != 0){
            fast = fast.next;
            K--;
        }
        Node slow = head;
        Node pre = null;
        while(fast != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(pre == null){
            pre = slow.next;
            head = pre;
        }
        else
            pre.next = slow.next;
        return head;
    }
}
