/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Map<Integer,ListNode>map=new HashMap<>();
        int j=0;
        ListNode temp=head;
        while(temp!=null){
            map.put(j,temp);
            j++;
            temp=temp.next;
        }
        int n=j-1;
        for(int i=0;n-i>=i;i++){
            ListNode cur1=map.get(i);
            if(n-i==i){
                cur1.next=null;
            }
            else{
                ListNode cur2=map.get(n-i);
                cur1.next=cur2;
                cur2.next=(n-(i+1)>=(i+1))?map.get(i+1):null;
            }    
        }
        return;
    }
}