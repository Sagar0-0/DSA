public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
        int i=0;
        int j=a.size();
        while(i<j){
            int mid=(i+j)/2;
            if(a.get(mid)==b){
                return mid;
            }else if(a.get(mid)<b){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return i;
	}
}
