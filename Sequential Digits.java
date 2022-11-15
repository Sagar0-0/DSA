class Solution {
    int low=0;
    int high=0;
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        this.high=high;
        this.low=low;
        for(int i=1;i<=9;i++){
            dfs(i,list);
        }
        Collections.sort(list);
        return list;
    }
    public void dfs(int num,List<Integer> list){
        int add=(num%10)+1;
        if(add!=10){
            num=(num*10)+add;
            if(num<=high){
                if(num>=low){
                    list.add(num);
                }
                dfs(num,list);
            }
        }
        
    }
}
