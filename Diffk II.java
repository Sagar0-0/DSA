public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        Set<Integer> set=new HashSet<>();
        for(int i:A){
            if(set.contains(i-B) || set.contains(B+i))return 1;
            set.add(i);
        }
        return 0;
    }
}
