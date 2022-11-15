class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(length==1)return head;
        k=k%length;
        ListNode newHead=rotate(head,k);
        return newHead;
    }
    public ListNode rotate(ListNode head,int k){
        if(k==0)return head;
        while(k!=0){
            ListNode temp=head;
            ListNode prev=null;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            temp.next=head;
            head=temp;
            k--;
        }
        return head;
        
    }
}

//=================================================================================
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        int size = getListSize(head);
        k %= size;
        if (k == 0)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < size-k; i++) {
            slow = fast;
            fast = fast.next;
        }
        slow.next = null;
        ListNode oldHead = head;
        head = fast;
        while (fast.next != null)
            fast = fast.next;
        fast.next = oldHead;
        return head;
    }
    
    public int getListSize(ListNode head) {
        if (head == null)
            return 0;
        return 1 + getListSize(head.next);
    }
}
//==================================================================================
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        ListNode temp=A;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        B=B%sz;
        int size=sz;
        temp=A;
        while(sz-B-1>0){
            sz--;
            temp=temp.next;
        }
        ListNode Alast=temp;
        ListNode Bfist=Alast.next;
        if(Bfist==null)return A;
        Alast.next=null;
        temp=Bfist;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=A;
        return Bfist;
    }
}
