import java.io.*;
import java.util.* ;

/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head1) {
		// Write your code here.
		if(head1 == null)
            return null;
        
        LinkedListNode<Integer> head2 = null;
        LinkedListNode<Integer> temp = null;
        
        LinkedListNode<Integer> t1 = head1;
        // firstly make simple linked list
        while(t1 != null){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(t1.data);
            if(head2 == null){
                head2 = newNode;
                temp = newNode;
            }
            else{
                temp.next = newNode;
                temp = newNode;
            }

            t1 = t1.next;
        }

        // change the connection
        LinkedListNode<Integer> h1 = head1;
        LinkedListNode<Integer> h2 = head2;

        while(h1 != null && h2 != null){
            LinkedListNode<Integer> next1 = h1.next;
            LinkedListNode<Integer> next2 = h2.next;

            h1.next = h2;
            h2.next = next1;

            h1 = next1;
            h2 = next2;
        }


        // connect random pointer
        h1 = head1;
        while(h1 != null){
            if(h1.random != null)
                 h1.next.random = h1.random.next;
            else
                h1.next.random = null;
            
            h1 = h1.next.next;
        }


        // now reverse the connectin 
        h1 = head1;
        h2 = head2;

        while(h2.next != null){
            LinkedListNode<Integer> next1 = h1.next.next;
            LinkedListNode<Integer> next2 = h2.next.next;

            h1.next = next1;
            h2.next = next2;

            h1 = next1;
            h2 = next2;
        }

        h1.next = null;
        h2.next = null;

        return head2;
	}
}
