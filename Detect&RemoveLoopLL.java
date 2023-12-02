
/*****************************************************
  
  Following is the structure of Node.
  public static class Node {
    
    int data;
    Node next;

    Node(int data) {
      this . data = data;
      this . next = null;
    }
  }

*****************************************************/

import java.util.ArrayList;

public class Solution {
  public static Node removeLoop(Node head) {
    // Write your code here.
    Node fast = head;
    Node slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow)
        break;
    }

    if (fast == null || fast.next == null)
      return head;

    Node pre = head;

    if (fast == head) {
      while (fast.next != head) {
        fast = fast.next;
      } 
    } else {
      while (fast.next != pre.next) {
        fast = fast.next;
        pre = pre.next;
      }
    }

    fast.next = null;

    return head;

  }
}
