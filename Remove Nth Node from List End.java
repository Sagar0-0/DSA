public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int size=0;
        ListNode temp=A;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(B>=size)return A.next;
        int toGo=size-B;
        temp=A;
        for(int i=1;i<toGo;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            return A;
        }
        temp.next=temp.next.next;
        return A;
    }
}
