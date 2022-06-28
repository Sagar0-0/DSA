class Solution {
    public int minDeletions(String s) {
        // Store the frequency of each character
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        
        Arrays.sort(frequency);
        
        int deleteCount = 0;
        // Maximum frequency the current character can have
        int maxFreqAllowed = s.length();
        
        // Iterate over the frequencies in descending order
        for (int i = 25; i >= 0 && frequency[i] > 0; i--) {
            // Delete characters to make the frequency equal the maximum frequency allowed
            if (frequency[i] > maxFreqAllowed) {
                deleteCount += frequency[i] - maxFreqAllowed;
                frequency[i] = maxFreqAllowed;
            }
            // Update the maximum allowed frequency
            maxFreqAllowed = Math.max(0, frequency[i] - 1);
        }
        
        return deleteCount;
    }     
}