class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer>count=new HashMap<>();
        for(int i:nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        Map<Integer,Integer> end=new HashMap<>();
        for(int i:nums){
            if(count.get(i)>0){
                count.put(i,count.get(i)-1);
                if(end.containsKey(i-1) && end.get(i-1)>0){
                    end.put(i,end.getOrDefault(i,0)+1);
                    end.put(i-1,end.get(i-1)-1);
                }else if(count.containsKey(i+1) && count.containsKey(i+2) && count.get(i+1)>0 && count.get(i+2)>0){
                    count.put(i+1,count.get(i+1)-1);
                    count.put(i+2,count.get(i+2)-1);
                    end.put(i+2,end.getOrDefault(i+2,0)+1);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}