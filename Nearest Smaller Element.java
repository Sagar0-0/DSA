public class Solution {
    public int[] prevSmaller(int[] A) {
        int n=A.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=findMin(A,i);
        }
        return ans;
    }
    public int findMin(int[]a,int index){
        int i=index;
        while(i>=0){
            if(a[i]<a[index]){
                return a[i];
            }
            i--;
        }
        return -1;
    }
}

//======================================
public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
    ArrayList<Integer> result=new ArrayList<>();
    result.add(-1);
    Stack<Integer> stack=new Stack<>();
    stack.push(A.get(0));
    for(int i=1;i<A.size();i++){
        while(!stack.isEmpty() && stack.peek()>=A.get(i))
            stack.pop();
        result.add(stack.isEmpty()?-1:stack.peek());
        stack.add(A.get(i));
    }
    return result;
}
}
