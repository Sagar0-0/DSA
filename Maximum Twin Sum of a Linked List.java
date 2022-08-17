class Solution {
    public int pairSum(ListNode head) {
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        int dp[]=new int[length/2];
        temp=head;
        int index=0;
        while(temp!=null){
            if(index<length/2){
                dp[index]+=temp.val;
            }else{
                dp[length-1-index]+=temp.val;
            }
            index++;
            temp=temp.next;
        }
        int ans=0;
        for(int i=0;i<dp.length;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}
