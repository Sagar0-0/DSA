public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> arr) {
        int n=arr.size();
        int a=0;
        int b=n-1;
        while(a<b){
            ArrayList<Integer> temp=arr.get(a);
            arr.set(a,arr.get(b));
            arr.set(b,temp);
			a++;
			b--;
        }
        int num=0;
        while(num<n){
            int i=num;
            while(i<n){
                int temp=arr.get(i).get(num);
                arr.get(i).set(num,arr.get(num).get(i));
                arr.get(num).set(i,temp);
                i++;
            }
            num++;
        }
    }
}
