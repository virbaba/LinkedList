import java.util.* ;
import java.io.*; 
/*
    Time Complexity : O(K)
    Space Complexity : O(1)

    Where, K is the position of the node to be inserted in the list.
*/

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

    static Node insert(int k, int val, Node head) {
        // Write your code here.
        Node newNode = new Node(val);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        if (k == 0) {
            newNode.next = head.next;
            head.next = newNode;
            int temp = head.data;
            head.data = newNode.data;
            newNode.data = temp;
            return head;
        }

        Node current = head;
        int count = 0;

        // Traverse the list to reach the (k-1)th node
        while (count < k - 1) {
            current = current.next;
            count++;
        }

        // Insert the new node at the kth position
        newNode.next = current.next;
        current.next = newNode;

        return head;
        
    }
}
