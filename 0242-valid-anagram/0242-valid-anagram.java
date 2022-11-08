class Solution {
    public boolean isAnagram(String a, String b) {
        char[] first= a.toCharArray();
        char[] sec= b.toCharArray();
        Arrays.sort(first);// O(nlogn)
        Arrays.sort(sec); // O(nlogn)
        return Arrays.equals(first,sec);
    }
}