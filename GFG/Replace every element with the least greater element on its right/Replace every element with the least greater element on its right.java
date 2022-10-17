class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            set.add(arr[i]);
            if(set.higher(arr[i])==null)ans.add(-1);
            else ans.add(set.higher(arr[i]));
        }
        Collections.reverse(ans);
        return ans;
    }
}
