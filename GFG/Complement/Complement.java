
//GFG dsa self-paced Coupon code: SAGARGFGPOTD

class Solve {

    Vector<Integer> findRange(String str, int n) {
        // code here
        int count=0;
        int l=-1;
        int max=0;
        int ansL=-1;
        int ansR=-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0'){
                count++;
            }else{
                count--;
                if(count<0){
                    count=0;
                    l=-1;
                }
            }
            
            if(count==1 && l==-1){
                l=i;
            }
            
            if(count>max){
                max=count;
                ansL=l;
                ansR=i;
            }
        }
        Vector<Integer> ans=new Vector<>();
        if(ansL==-1){
            ans.add(-1);
        }else{
            ans.add(ansL+1);
            ans.add(ansR+1);
        }
        return ans;
    }
}
