public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.size() && j<b.size()){
            int x=a.get(i);
            int y=b.get(j);
            if(x==y){
                ans.add(a.get(i));
                i++;
                j++;
            }else if(x<y){
                i++;
            }else{
                j++;
            }
        }
        return ans;
    }
}
