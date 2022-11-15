class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int hLeft = height[left];
            int hRight = height[right];
            
            result = Math.max(result, Math.min(hLeft, hRight) * (right - left));
            
            if (hLeft < hRight) {
                while (left < right && height[left] <= hLeft) {
                    left++;                    
                }
            } else {
                while (left < right && height[right] <= hRight) {
                    right--;                    
                }
            }
        }
        return result;
    }
}