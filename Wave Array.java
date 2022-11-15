public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> arr) {
        Collections.sort(arr);
        int i=0;
        while(i+1<arr.size()){
            int first=i;
            int second=i+1;
            Collections.swap(arr,first,second);
            i+=2;
        }
        return arr;
    }
}
