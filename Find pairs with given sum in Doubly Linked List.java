
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node tail=head;
        while(tail.next!=null)tail=tail.next;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        while(head!=tail){
            if(head.data+tail.data==target){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(head.data);
                pair.add(tail.data);
                ans.add(pair);
                tail=tail.prev;
            }else if(head.data+tail.data>target){
                tail=tail.prev;
            }else{
                head=head.next;
            }
        }
        return ans;
    }
