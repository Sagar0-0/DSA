public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long max=0;
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<a.size()){
            long curr=0;
            ArrayList<Integer> maybe=new ArrayList<>();
            while(i<a.size()){
                if(a.get(i)<0)break;
                maybe.add(a.get(i));
                curr+=a.get(i);
                i++;
            }
            if(curr>max){
                max=curr;
                ans.clear();
                ans=maybe;
            }else if(curr==max){
                if(maybe.size()>ans.size()){
                    ans.clear();
                    ans=maybe;
                }
            }
            i++;
        }
        return ans;
    }
}
