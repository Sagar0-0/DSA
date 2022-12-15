class Solution {
    static String BalancedString(int N) {
        // code here
        StringBuilder ans=new StringBuilder();
        String full="abcdefghijklmnopqrstuvwxyz";
        int n=N;
        while(N>26){
            ans.append(full);
            N-=26;
        }
        
        if(N%2==0){//even
            for(int i=0;i<N/2;i++)ans.append((char)('a'+i));
            for(int i=26-N/2;i<26;i++)ans.append((char)('a'+i));
        }else{//odd
            int sum=0;
            while(n>0){
                sum+=(n%10);
                n/=10;
            }
            if(sum%2==0){//even
                for(int i=0;i<(N+1)/2;i++)ans.append((char)('a'+i));
                for(int i=26-N/2;i<26;i++)ans.append((char)('a'+i));
            }else{//odd
                for(int i=0;i<N/2;i++)ans.append((char)('a'+i));
                for(int i=26-(N+1)/2;i<26;i++)ans.append((char)('a'+i));
            }
            
        }
        return ans.toString();
    }
}
