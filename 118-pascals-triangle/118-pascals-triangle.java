class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> base=new ArrayList<>();
        base.add(1);
        ans.add(base);
        if(numRows==1)return ans;
        List<Integer> base2=new ArrayList<>();
        base2.add(1);
        base2.add(1);
        ans.add(base2);
        if(numRows==2)return ans;
        for(int i=0;i<numRows-2;i++){
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            
            List<Integer> prev=ans.get(ans.size()-1);
            for(int j=0;j<prev.size()-1;j++){
                curr.add(prev.get(j)+prev.get(j+1));
            }
            curr.add(1);
            ans.add(curr);
        }
        return ans;
    }
}