public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    ArrayList<Integer> arr;
    int target;
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B){
        ans=new ArrayList<>();
        target=B;
        Collections.sort(A);
        arr=A;
        dfs(0,0,new ArrayList<>());
        return ans;
    }
    public void dfs(int sum,int index,ArrayList<Integer> curr){
        if(sum>target)return;
        if(sum==target){
            if(!ans.contains(curr)){
                ans.add(new ArrayList<>(curr));
            }
        }
        for(int i=index;i<arr.size();i++){
            int ele=arr.get(i);
            if(i>index && ele==arr.get(i-1))continue;
            curr.add(ele);
            sum+=ele;
            dfs(sum,i,curr);
            curr.remove(curr.size()-1);
            sum-=ele;
        }
    }
}
