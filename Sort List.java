//Faster
class Solution {
    public ListNode sortList(ListNode head) {
        int len = 0;
        ListNode h = head;
        while (h != null) {
            len++;
            h = h.next;
        }
        
        int[] tmp = new int[len];
        
        h = head;
        for (int i = 0; i < len; i++) {
            tmp[i] = h.val;
            h = h.next;
        }
        
        Arrays.sort(tmp);
        
        h = head;
        for (int i = 0; i < len; i++) {
            h.val = tmp[i];
            h = h.next;
        }
        
        return head;
    }
}

//==============================================================
//merge sort (iterative)

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
//===============================================================================
//merge sort (recursive)
public class Solution {

    public ListNode merge(ListNode A,ListNode B){
        ListNode res=null;
        if(A==null)
            return B;
        if(B==null)
            return A;
        if(A.val<=B.val){
            res=A;
            res.next=merge(A.next,B);
        }else{
            res=B;
            res.next=merge(A,B.next);
        }
        return res;
    }

    public ListNode sortList(ListNode A) {
        if(A==null || A.next==null)
            return A;
        ListNode middle=getMiddle(A);
        ListNode nextOfMiddle=middle.next;
        middle.next=null;
        ListNode left=sortList(A);
        ListNode right=sortList(nextOfMiddle);
        ListNode ans=merge(left,right);
        return ans;
    }

    public ListNode getMiddle(ListNode A){
        if(A==null)
            return A;
        ListNode slow=A,fast=A;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
