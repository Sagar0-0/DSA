class Solution {
    public String reverseWords(String sy) {
        String[] arr=sy.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            sb.reverse();
            arr[i]=sb.toString();
        }
        StringBuilder ans=new StringBuilder();
        for(String s:arr){
            ans.append(s);
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}