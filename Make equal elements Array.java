public class Solution {
    public int solve(int[] A, int B) {
        Set<Integer> set=new HashSet<>();
        set.add(A[0]+B);
        set.add(A[0]-B);
        for(int i=1;i<A.length;i++){
            if(!set.contains(A[i]+B) && !set.contains(A[i]-B) && !set.contains(A[i])){
                return 0;
            }
        }
        return 1;
    }
}
