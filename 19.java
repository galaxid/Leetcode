/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t1=head,t2=head;
        for(int i=0;i<n;i++){
            t2=t2.next;
        }
        if(t2!=null){
            while(t2.next!=null){
                t1=t1.next;
                t2=t2.next;
            }
            t1.next=t1.next.next;
        }
        else return head.next;
        return head;
    }
}
