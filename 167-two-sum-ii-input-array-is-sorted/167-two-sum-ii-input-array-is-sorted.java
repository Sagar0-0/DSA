class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        boolean targetLocated = false;
        while (left < right && !targetLocated) {
            int mid = left + (right - left) / 2;
            int midVal = numbers[mid];
            int curr = numbers[left] + numbers[right];
            if(curr == target) {
                targetLocated = true;
            } else if (curr < target) {
                if (midVal + numbers[right] < target) {
                    left = mid + 1;
                } else {
                    left++;
                }
                
            } else {
                
                if (midVal + numbers[left] > target) {
                    right = mid - 1;
                } else {
                    right--;
                }
                
                
            }
            
        }
        
        int[] vals = new int[2];
        vals[0] = left + 1;
        vals[1] = right + 1;
        
        return vals;
        
    }
}