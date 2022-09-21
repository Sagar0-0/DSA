// Heres the simple solution:

// Runtime: 6ms
// Memory: 42 MB
// Faster than: 81.48%

class Solution {
    public String largestNumber(int[] nums) {
        int n= nums.length;
        String [] s = new String[n];
        for(int i = 0; i < n; i++)
            s[i] = ""+nums[i];
        
        Arrays.sort(s, (a, b) -> (b+a).compareTo(a+b));
        
        StringBuilder sb = new StringBuilder();
        for(String str: s)
            sb.append(str);
        
        String result = sb+"";
        return result.startsWith("0")? "0" : result;
    }
}
