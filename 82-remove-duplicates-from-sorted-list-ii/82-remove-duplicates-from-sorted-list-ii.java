/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode head=null;
        ListNode curr=null;
        ListNode temp=A;
        while(temp!=null){
            if(temp.next!=null){
                int value=temp.val;
                if(temp.next.val==value){
                    while(temp!=null && temp.val==value){
                        temp=temp.next;
                    }
                }else{
                    if(head==null){
                        head=temp;
                        curr=temp;
                    }else{
                        curr.next=temp;
                        curr=curr.next;
                    }
                    temp=temp.next;
                    curr.next=null;
                }
            }else{
                if(head==null){
                    head=temp;
                    curr=temp;
                }else{
                    curr.next=temp;
                    curr=curr.next;
                }
                temp=temp.next;
                curr.next=null;
            }
        }
        return head;
    }
}
