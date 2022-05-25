public class Solution {
    public int maxEnvelopes(int[][] envelopes) {        
        Arrays.sort(envelopes,new Comparator<>(){
            @Override
            public int compare(int[] arr1, int[] arr2){
                if(arr1[0]==arr2[0]){
                    return arr2[1]-arr1[1];
                } else {
                    return arr1[0]-arr2[0];
                }
            }
        });
        int[] lis=new int[envelopes.length];
        int len=0;
        for(int i=0;i<envelopes.length;++i){
            int index=Arrays.binarySearch(lis,0,len,envelopes[i][1]);
            if(index<0){
                index=-index-1;
            }
            lis[index]=envelopes[i][1];
            if(index==len){
                len++;
            }
        }
        return len;
    }
}