class Solution {
    public int[] findOriginalArray(int[] changed) {
        int f[]=new int[100001];
        if(changed.length%2==1) return new int[0]; // if Array Length is odd cant find
        for(int i=0;i<changed.length;i++) {
            f[changed[i]]+=1;
        }
        int res[]=new int[changed.length/2];
        int ind=0;
        for(int i=0;i<100001;i++) {
            int k=i;
            if(f[k]==0) continue;
            while(f[k]>0) {
                if(k*2>100000 || f[k*2]==0) return new int[0];  //As Array values always <=100000 and cant be greater values cannot find k*2>1000000 which is false and id the frequency of k*2==0 means return false
                else {
                    f[k*2]-=1;
                    f[k]-=1;
                    res[ind++]=i;
                }
            }   
        }
        return res;
    }
}
