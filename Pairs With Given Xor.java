public class Solution {
    public int solve(int[] A, int B) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : A){
            if(set.contains(i)){
                count++;
            }else{
                set.add(i^B);
            }
        }
        return count;
    }
}

