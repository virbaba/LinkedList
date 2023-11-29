import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(Node head, int n, int pos, int val) {
        // Write your code here.
        Node data = new Node(val);
        Node pre = null;
        Node curr = head;

        while(pos != 0){
            pre = curr;
            curr = curr.next;
            pos--;
        }

        if(pre ==  null){
            pre = data;
            pre.next = curr;
            head = pre;
        }
        else{
            pre.next = data;
            data.next = curr;
        }

        return head;

    }
}
