class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> s=new Stack<>();
        int i=0;
        int j=0;
        while(j<n){
            while(i<n && (s.isEmpty() || s.peek()!=op[j])){
                s.push(ip[i]);
                i++;
            }
            while(!s.isEmpty() && s.peek()==op[j]){
                s.pop();
                j++;
            }
            if(i==n && !s.isEmpty() && s.peek()!=op[j])return 0;
        }
        return 1;
    }
}
