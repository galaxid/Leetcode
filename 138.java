/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)return null;
        List<RandomListNode>list=new ArrayList<>();
        Map<RandomListNode,Integer>map=new HashMap<>();
        int i=0;
        RandomListNode temp=head;
        while(head!=null){
            map.put(head,i);
            RandomListNode cur=new RandomListNode(head.label);
            if(i>0)list.get(i-1).next=cur;
            list.add(cur);
            i++;
            head=head.next;
        }
        head=temp;
        i=0;
        while(head!=null){
            if(head.random==null)list.get(i).random=null;
            else{
                int a=map.get(head.random);
                list.get(i).random=list.get(a);
            }
            i++;
            head=head.next;
        }
        return list.get(0);
    }
}