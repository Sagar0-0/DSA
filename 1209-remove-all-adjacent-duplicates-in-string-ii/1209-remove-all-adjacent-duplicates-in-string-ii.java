class Solution {
    public String removeDuplicates(String s, int k) {
        int w = 0;
        int n = s.length();
        int []count = new int[n];
        char[] ar = s.toCharArray();
        for(int i=0;i<n;i++){
            ar[w]=ar[i];          
            if(w==0||ar[w-1]!=ar[w]){
                count[w]=1;
            }else{
                count[w]=count[w-1]+1;
                if(count[w]==k){
                    w=w-k;
                }
            }
            w++;
        }
        
        return new String(ar, 0, w);
    }
}