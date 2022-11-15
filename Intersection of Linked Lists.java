public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
        //size of list a
        int sizeA=0;
        ListNode tempA=a;
        while(tempA!=null){
            sizeA++;
            tempA=tempA.next;
        }

        //size of list b
        int sizeB=0;
        ListNode tempB=b;
        while(tempB!=null){
            sizeB++;
            tempB=tempB.next;
        }

        tempA=a;
        tempB=b;

        if(sizeB>sizeA){
            //move b diff times
            int diff=sizeB-sizeA;
            while(diff--!=0){
                tempB=tempB.next;
            }
        }else if(sizeA>sizeB){
            //move a diff times
            int diff=sizeA-sizeB;
            while(diff--!=0){
                tempA=tempA.next;
            }
        }

        //move untill they meet or they become null
        while(tempA!=tempB && tempA!=null && tempB!=null){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        
        if(tempA==null || tempB==null)return null;
        return tempB;
	}
}
