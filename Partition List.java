/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode ans=new ListNode(-1);
        ListNode largers=new ListNode(-1);
        ListNode currLar=largers;
        ListNode curr=ans;
        ListNode temp=A;
        while(temp!=null){
            ListNode node=temp;
            temp=temp.next;
            node.next=null;
            if(node.val<B){
                curr.next=node;
                curr=curr.next;
            }else{
                currLar.next=node;
                currLar=currLar.next;
            }
        }
        curr.next=largers.next;
        return ans.next;
    }
}
