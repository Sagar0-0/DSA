public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int l=0;
        int h=A.size()-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(A.get(mid)==B){
                return mid;
            }else if(A.get(mid)<B){
                if(A.get(h)<A.get(mid)){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }else if(A.get(mid)>B){
                if(A.get(l)<A.get(mid)){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return -1;
    }
}
