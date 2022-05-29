class Solution {
    public int maxProduct(String[] words) {
        int ans=0;
        int n=words.length;
        int[][]arr=new int[n][26];
        for(int i=0;i<n;i++){
            for(char c:words[i].toCharArray()){
                arr[i][c-'a']++;
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                boolean cont=false;
                for(int k=0;k<26;k++){
                    if(arr[i][k]>0 && arr[j][k]>0){
                        cont=true;
                        break;
                    }
                }
                if(cont)continue;
                int curr=words[i].length()*words[j].length();
                ans=Math.max(ans,curr);
            }
        }
        return ans;
    }
}