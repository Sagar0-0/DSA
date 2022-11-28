class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> p=new HashMap<>();
        int n=matches.length;
        int maxEle=0;
        for(int[] match:matches){
            p.putIfAbsent(match[0],0);
            p.putIfAbsent(match[1],0);
            p.put(match[1],p.get(match[1])+1);
            maxEle=Math.max(maxEle,Math.max(match[0],match[1]));
        }
        List<Integer> zeroes=new ArrayList<>();
        List<Integer> ones=new ArrayList<>();
        for(int i=1;i<=maxEle;i++){
            if(!p.containsKey(i))continue;
            if(p.get(i)==0){
                zeroes.add(i);
            }else if(p.get(i)==1){
                ones.add(i);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(zeroes);
        ans.add(ones);
        return ans;
    }
}