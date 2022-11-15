class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> res = new ArrayList<>();
        List out = new ArrayList<>();
        back(res,out,k,n,1);
        return res;
    }
    void back(List<List<Integer>> res,List<Integer> out,int currSize,int n,int limit)
    {
        if(out.size()==currSize && n ==0)
        {
            res.add(new ArrayList<>(out));
            return ;
        }
        if(limit>9)
        {
            return ;
        }
            
        if(out.size()>currSize)
        {
            return ;
        }
        if(n<0)
        {
            return ;
        }
        out.add(limit);
        back(res,out,currSize,n-limit,limit+1);
        out.remove(out.size()-1);
        back(res,out,currSize,n,limit+1);
    }
}