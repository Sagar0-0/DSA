class Solution {
    public int destroyTargets(int[] nums, int space) {
        HashMap<Integer, Integer> remCount  = new HashMap<>();
        HashMap<Integer, Integer> remNum = new HashMap<>();
        for(int e : nums){
            int rem = e%space;

            remNum.put(rem, Math.min(e,remNum.getOrDefault(rem, Integer.MAX_VALUE) ));
            remCount.put(rem, remCount.getOrDefault(rem,0)+1);
        }

        int max = -1; int remMax=-1; int re = -1;
        for(int rem : remCount.keySet()){
            if(remCount.get(rem)>max){
                remMax = rem; max = remCount.get(rem);
                re = remNum.get(remMax);
            }
        }

        int result = Integer.MAX_VALUE;
        for(int key :  remNum.keySet()){
            if(remCount.get(key)==max){
                result = Math.min(remNum.get(key), result);
            }
        }

        return result;
    }
}