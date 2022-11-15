public class Solution {
    public int lPalin(ListNode A) {
        if(A==null || A.next==null)return 1;
        int sz=0;
        ListNode temp=A;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        ListNode prev=null;
        ListNode curr=A;
        for(int i=0;i<sz/2;i++){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return check(curr,prev) | check(prev,curr.next);
    }
    public int check(ListNode A,ListNode B){
        ListNode a=A;
        ListNode b=B;
        while(a!=null && b!=null){
            if(a.val!=b.val)return 0;
            a=a.next;
            b=b.next;
        }
        return (a==null && b==null)?1:0;
    }
}
