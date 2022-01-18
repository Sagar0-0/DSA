class Solution{
    
    public static int solve(Node root, boolean canTake,String path, Map<String,Integer> dp){
        if(root==null) return 0;
        if(canTake && dp.containsKey(path+'t')) return dp.get(path+'t');
        else if(!canTake && dp.containsKey(path+'f')) return dp.get(path+'f');
        if(canTake){
            int ans1 = root.data + solve(root.left,false,path+'l',dp) + solve(root.right,false, path+'r',dp);
            int ans2 = solve(root.left,true,path+'l',dp) + solve(root.right,true,path+'r',dp);
            int ans = Math.max(ans1,ans2);
            dp.put(path+'t',ans);
            return ans;
        }
        int ans =  solve(root.left,true,path+'l',dp) + solve(root.right,true,path+'r',dp);
        dp.put(path+'f',ans);
        return ans;
    }
    
    //Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root){
        // add your code here
        Map<String,Integer> dp = new HashMap<>();
        return Math.max(solve(root,true,"",dp),solve(root,false,"",dp));
    }
}
