public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> a, int B) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=a.size();
        if(B>n)return ans;
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<B;i++){
            map.put(a.get(i),map.getOrDefault(a.get(i),0)+1);
        }
        ans.add(map.size());
        for(int i=1;i<=n-B;i++){
            int prev=a.get(i-1);
            map.put(prev,map.get(prev)-1);
            if(map.get(prev)==0)map.remove(prev);
            int last=a.get(i+B-1);
            map.put(last,map.getOrDefault(last,0)+1);
            ans.add(map.size());
        }
        return ans;
    }
}
