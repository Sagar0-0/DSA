class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid[0].length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new LinkedList<>();
        for(int[]a:grid){
            for(int i:a){
                list.add(i);
            }
        }
        k%=list.size();
        List<Integer> temp=new ArrayList<>();
        while(k!=0){
            temp.add(list.remove(list.size()-1));
            k--;
        }
        for(int i=0;i<temp.size();i++){
            list.add(0,temp.get(i));
        }
        for(int i=0;i<list.size();i++){
            int sz=n;
            List<Integer> l=new ArrayList<>();
            while(sz!=0){
                l.add(list.get(i));
                i++;
                sz--;
            }
            i--;
            ans.add(l);
        }
        return ans;
    }
}