class Solution {
    static int safePos(int n, int k) {
        ArrayList<Integer>aa=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            aa.add(i+1);
        }
        int a=0;
        while(aa.size()!=1){
            a=(a+(k-1))%aa.size();
            aa.remove(a);
            
        }
        return aa.get(0);
    }
};
