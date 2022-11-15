public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int diff = Integer.MAX_VALUE;
        int res_i =0, res_j = 0, res_k = 0;
        int i = 0, j = 0, k = 0;
        while (i < A.size() && j < B.size() && k < C.size()){
            int minimum = Math.min(A.get(i),
                          Math.min(B.get(j), C.get(k)));
            int maximum = Math.max(A.get(i),
                          Math.max(B.get(j), C.get(k)));
            // Update result if current diff is
            // less than the min diff so far
            if (maximum-minimum < diff){
                res_i = i;
                res_j = j;
                res_k = k;
                diff = maximum - minimum;
            }
            // We can't get less than 0
            // as values are absolute
            if (diff == 0) break;
     
            // Increment index of array
            // with smallest value
            if (A.get(i)== minimum) i++;
            else if (B.get(j) == minimum) j++;
            else k++;
        }
        
            int minimum = Math.min(A.get(res_i),
                          Math.min(B.get(res_j), C.get(res_k)));
            int maximum = Math.max(A.get(res_i),
                          Math.max(B.get(res_j), C.get(res_k)));
                          return maximum-minimum;
    }
    
    public int abs(int a){
        if(a<0){
            return -a;
        }
        return a;
    }
    
    
}

