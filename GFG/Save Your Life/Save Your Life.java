class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(x[i],b[i]);
        }
        
        StringBuilder ans=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(char c:w.toCharArray()){
            curr+=map.containsKey(c)?map.get(c):c;
            temp.append(c);
            if(curr>max){
                max=curr;
                ans=new StringBuilder(temp);
            }
            
            if(curr<0){
                curr=0;
                temp=new StringBuilder();
            }
        }
        return ans.toString();
    }
}



//Approach 2
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        int i= 0;
        int j=0;
        int max=Integer.MIN_VALUE;
        int res[]=new int[52];
        for(int k=0;k<52;k++) {
            res[k]=2000;
        }
        for(int k=0;k<x.length;k++) {
            if(x[k]>='a' && x[k]<='z')
                res[x[k]-'a']=b[k];
            else
                res[x[k]-'A'+26]=b[k];
        }
        for(int k=0;k<26;k++) {
            if(res[k]==2000) {
                res[k]=97+k;
            }
        }
        for(int k=26;k<52;k++) {
            if(res[k]==2000) {
                res[k]=65+k-26;
            }
        }
        int count =0;
        int maxI=0;
        int maxJ=0;
        while(j<w.length()) {
            if(w.charAt(j)>='a' && w.charAt(j)<='z')
                count+=res[w.charAt(j)-'a'];
            else
                count+=res[w.charAt(j)-'A'+26];
            if(count>max) {
                max=count;
                maxI=i;
                maxJ=j;
            }
            
            if(count<0) {
                count=0;
                i=j+1;
            }
            j+=1;
        }
        return w.substring(maxI, maxJ+1);
    }
}
