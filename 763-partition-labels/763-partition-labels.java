class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        int[]last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-97]=i;
        }
        for(int i=0;i<s.length();i++){
            int start=i;
            int end=last[s.charAt(i)-97];
            while(start<end){
                char ch=s.charAt(start);
                end=Math.max(end,last[ch-97]);
                start++;
            }
            int size=end-i+1;
            i=start;
            list.add(size);
        }
        return list;
    }
}