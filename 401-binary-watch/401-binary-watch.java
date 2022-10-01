class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        
        List<String> ans=new ArrayList<>();
        
        if(turnedOn>8){
            return ans;
        }
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                
                //bit count will count total set bit(1) in a numbmer
                if(Integer.bitCount(h*64+m)==turnedOn){
                    ans.add(String.format("%d:%02d",h,m));
                }
            }
        }
        return ans;
    }
}