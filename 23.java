/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;
        if(len==0)return null;
        if(len==1)return lists[0];
        int k=len/2;
        int i=0;
        while(k>0){
            for(int j=i;j<i+k;j++){
                ListNode l3=merge(lists[j],lists[j+k]);
                lists[j]=null;
                lists[j+k]=l3;
                len--;
            }
            i+=k;
            k=len/2;
        }
        return merge(lists[lists.length-2],lists[lists.length-1]);

    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode l3= new ListNode(-1);
        ListNode head=l3;
        while(l1!=null||l2!=null){
            ListNode temp= new ListNode(-1);
            if(l1==null||l2!=null&&l2.val<l1.val){
                temp.val=l2.val;
                l2=l2.next;
            }
            else {
                temp.val=l1.val;
                l1=l1.next;
            }
            
            l3.next=temp;
            l3=temp;
        }  
        return head.next;
    }
}
