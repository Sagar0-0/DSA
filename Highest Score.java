public class Solution {
    public int highestScore(String[][] A) {
        HashMap<String,Long> totalMarks=new HashMap<>();
        HashMap<String,Long> freqMarks=new HashMap<>();
        for(String x[]:A){
            long marks=Long.parseLong(x[1]);
            if(totalMarks.containsKey(x[0])){
                Long val=totalMarks.get(x[0]);
                long freq=freqMarks.get(x[0]);
                totalMarks.put(x[0],(Long)val+marks);
                freqMarks.put(x[0],++freq);
            }else{
                totalMarks.put(x[0],marks);
                freqMarks.put(x[0],1L);
            }
        }
        long max=Integer.MIN_VALUE;
        for(String x[]:A){
            long sum=totalMarks.get(x[0]);
            long freq=freqMarks.get(x[0]);
            max=Math.max(max,(sum/freq));
        }
        return (int)max;
    }
}

