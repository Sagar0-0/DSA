class Solution {
    public boolean isAnagram(String a, String b) {
        int[] arr=new int[128]; //O(1)
        if(a.length()!=b.length()){
            return false;
        }
        // abca
        // caba
        for(int i=0;i<a.length();i++){
            char ch1=a.charAt(i);
            char ch2=b.charAt(i);
            arr[ch1]++;
            arr[ch2]--;
        }//O(n)
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}