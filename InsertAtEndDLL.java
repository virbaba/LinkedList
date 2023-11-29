
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node insertAtTail(Node head, int K) {
        // Write your code here
        Node newNode = new Node(K);
        Node curr = head;

        while(curr != null && curr.next != null){
            curr = curr.next;
        }

        if(curr == null)
            return newNode;

        curr.next = newNode;
        newNode.prev = curr;
        
        return head;
    }
}
