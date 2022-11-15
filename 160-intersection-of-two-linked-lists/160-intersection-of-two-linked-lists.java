public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        int n=0,m=0;
        while(t1!=null){
            m++;
            t1=t1.next;
        }
        while(t2!=null){
            n++;
            t2=t2.next;
        }
        t1=headA;
        t2=headB;
        int t=m-n;
        if(t>0){
            m-=t;
            while(t>0){
                t1=t1.next;
                t--;
            }
        }else{
            t=-t;
            n-=t;
            while(t>0){
                t2=t2.next;
                t--;
            }
        }
        
        while(n>0){
            if(t1==t2)
                break;
            n--;
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
        
    }
}