import java.util.*;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        else if(head.next==null){
           return false; 
        }
        else{
            ListNode a = head;
            ListNode b = head.next;
            while(true){
                if(a==b) return true;
                else{
                    a=a.next;
                    b=b.next;
                    if(b==null)return false;
                    b=b.next;
                    if(b==null)return false;
                }
                
            }
        }
    }
}