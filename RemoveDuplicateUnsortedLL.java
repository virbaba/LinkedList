import java.util.* ;
import java.io.*; 

/************************************************************

    Following is the linked list node structure
    
    class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

************************************************************/


public class Solution {
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

        // Write your code here	
        HashMap<Integer, Boolean> visit = new HashMap<>();
        LinkedListNode<Integer> root = null;
        LinkedListNode<Integer> temp = null;

        while(head != null){
            if(!visit.containsKey(head.data)){
                if(root == null){
                    root = head;
                    temp = head;
                    
                }
                else{
                    temp.next = head;
                    temp = head;
                }
                
                visit.put(head.data, true);  
            }   
            head = head.next;
        }
        temp.next = null;

        return root;
        
	}

}
