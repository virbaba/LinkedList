import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next,prev;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(int k, int val, Node head) {
        // Write your code here.
        Node curr = head;
        Node newNode = new Node(val);

        if(k == 0){
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else{
            while(k != 1){
                curr = curr.next;
                k--;
            }
            Node temp = curr.next;
            curr.next = newNode;
            newNode.prev = curr;
            newNode.next  = temp;
        }

        return head;
    }
}
