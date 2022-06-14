/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> arr) {
        ArrayList<Interval> ans=new ArrayList<>();
        Collections.sort(arr,(a,b)->a.start-b.start);
        ans.add(arr.get(0));
        int idx=0;
        for(int i=1;i<arr.size();i++){
            if(ans.get(idx).end<arr.get(i).start){
                ans.add(arr.get(i));
                idx++;
            }else if(ans.get(idx).end>=arr.get(i).start){
                ans.get(idx).end= Math.max(ans.get(idx).end,arr.get(i).end);
            }
        }
        return ans;
    }
}
