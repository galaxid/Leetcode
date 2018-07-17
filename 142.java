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
    public ListNode detectCycle(ListNode head) {
        ListNode a;
        ListNode b;
        if(head==null){
            return null;
        }
        else if(head.next==null){
           return null; 
        }
        else{
            a = head;
            b = head;
            while(true){
                a=a.next;
                b=b.next;
                if(b==null)return null;
                b=b.next;
                if(b==null)return null;
                if(a==b) break;         
            }
        }
        if(a==head)return a;
        else a = head; 
        while(true){
            if(a==b)return a;
            a=a.next;
            b=b.next;
        }
    }
}