import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;
 Node<T> prev;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node deleteNode(Node head, int pos) {
        // Write your code here.
        Node curr = head;
        if(pos == 0)
            return curr.next;

        while(pos != 0 && curr != null){
            curr = curr.next;
            pos--;
        }

        if(curr == null)
            return head;


        Node pre = curr.prev;
        pre.next = curr.next;

        return head;
        
    }
}
