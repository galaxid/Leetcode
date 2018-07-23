/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i=0,j=0;
        ListNode a=l1,b=l2;
        List<Integer> ans=new ArrayList<>();
        while(a!=null){
            a=a.next;
            i++;
        }
         while(b!=null){
            b=b.next;
            j++;
        }
        int length=Math.max(i,j);
        int length2=Math.min(i,j);
        if(i>j){
            a=l1;
            b=l2;
        }
        else{
            a=l2;b=l1;
        }
        i=0;j=0;
        while(i<length){
            if(i>=length-length2){
                ans.add(a.val+b.val);
                i++;j++;
                a=a.next;b=b.next;
            } 
            else {
                ans.add(a.val);
                i++;
                a=a.next;
            }            
        }
        b=new ListNode(0);
        b.next=null;
        for(int k=ans.size()-1;k>0;k--){
            if(ans.get(k)>9){
                ans.set(k-1,ans.get(k-1)+ans.get(k)/10);
                ans.set(k,ans.get(k)%10);
            }
            b.val=ans.get(k);
            a=new ListNode(0);
            a.next=b;
            b=a;
        }
        if(ans.get(0)>9){
            ans.add(0,ans.get(0)/10);
            ans.set(1,ans.get(1)%10);
            b.val=ans.get(1);
            a=new ListNode(0);
            a.next=b;
            a.val=ans.get(0);
            b=a;            
        }
        b.val=ans.get(0);
        return b;
    }
}