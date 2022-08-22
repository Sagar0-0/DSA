public class Solution {
    public ArrayList<Integer> solve(String A) {
        ArrayList<Integer> arr=new ArrayList<>();
        String[] ar=A.split(",");
        for(int i=0;i<ar.length;i++){
            arr.add(Integer.parseInt(ar[i]));
        }
        return arr;
    }
}
