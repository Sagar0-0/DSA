class Solution {
    private HashMap<Integer, Integer> points = new HashMap<>();
    private HashMap<Integer, Integer> cache = new HashMap<>();
    
    private int maxPoints(int num) {
        // Check for base cases
        if (num == 0) {
            return 0;
        }
        
        if (num == 1) {
            return points.getOrDefault(1, 0);
        }
        
        if (cache.containsKey(num)) {
            return cache.get(num);
        }
        
        // Apply recurrence relation
        int gain = points.getOrDefault(num, 0);
        cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));
        return cache.get(num);
    }
    
    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;
        
        // Precompute how many points we gain from taking an element
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }
        
        return maxPoints(maxNumber);
    }
}

//==================================================================================
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] count = new int[10001];
        for (int n : nums) {
            count[n]++;
        };
        
        int withPrev = 0;
        int withoutPrev = 0;
        int prev = -1;
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) continue;
            
            int currentMax = Math.max(withPrev, withoutPrev);
            if (i - prev == 1) {
                withPrev = withoutPrev + count[i] * i;
                withoutPrev = currentMax;
            } else {
                withPrev = currentMax + count[i] * i;
                withoutPrev = currentMax;
            }
            
            prev = i;
        }
        
        return Math.max(withPrev, withoutPrev);
    }
}
