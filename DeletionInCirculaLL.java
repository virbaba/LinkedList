/*

    Following is the representation of the Circular Linked List
    
    class Node<T> {
        T data;
        Node<T> next;
        
        public Node(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

    public static Node<Integer> deleteNode(Node<Integer> head, int key) {
        //Your code goes here
        Node<Integer> curr = head;
        Node<Integer> pre = head;
        if(head == null)
            return null;
            
        while(pre.next != head || pre.data == key){
            if(curr.data == key){
                if(curr == head){
                    Node temp = head;
                    head = head.next;
                    if(head == curr){
                        head.next = null;
                        head = null;
                        return head;
                    }
                    while(curr.next != temp){
                        curr = curr.next;
                    }
                    curr.next = head;
                    return head;
                }
                if(curr.next == head){
                    pre.next = head;
                    return head;
                }
                pre.next = curr.next;
                break;

            }
            pre = curr;
            curr = curr.next;


        }
        
        return head;
    }

}
