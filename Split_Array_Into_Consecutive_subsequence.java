
class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> available = new HashMap<>();
        for(int i:nums)
            available.put(i,available.getOrDefault(i,0)+1);
        HashMap<Integer,Integer> vacancyFor = new HashMap<>();
        for(int i:nums)
        {
            int freq = available.get(i);
            if(freq > 0)
            {
                if(vacancyFor.containsKey(i) && vacancyFor.get(i)>0)
                {
                    vacancyFor.put(i,vacancyFor.getOrDefault(i,0)-1);
                    vacancyFor.put(i+1,vacancyFor.getOrDefault(i+1,0)+1);
                    available.put(i,available.getOrDefault(i,0)-1);
                }
                else
                {
                    if(available.containsKey(i+1) && available.containsKey(i+2) && available.get(i+1)>0 && available.get(i+2)>0)
                    {
                        vacancyFor.put(i+3,vacancyFor.getOrDefault(i+3,0)+1);
                        available.put(i,available.getOrDefault(i,0)-1);
                        available.put(i+1,available.getOrDefault(i+1,0)-1);
                        available.put(i+2,available.getOrDefault(i+2,0)-1);
                    }
                    else
                        return false;
                }
            }
        }
        return true;
    }
}
