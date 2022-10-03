class Solution {
    public int minCost(String s, int[] arr) {
        int ans=0;
        int i=0;
        while(i<s.length()){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                int j=i;
                int maxValue=0;
                while(j<s.length() && s.charAt(j)==s.charAt(i)){
                    if(arr[j]>maxValue){
                        maxValue=arr[j];
                    }
                    j++;
                }
                while(i<j){
                    ans+=arr[i];
                    i++;
                }
                ans-=maxValue;
            }else{
                i++;
            }
        }
        return ans;
    }
}