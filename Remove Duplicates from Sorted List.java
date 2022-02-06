public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode temp=A;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return A;
    }
}
