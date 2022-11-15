class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        int[]ans= new int [n];
        Stack<Integer> s= new Stack<>();
        int j=0,i=0;
        for(int k=0;k<n*2;k++){
            if(!s.isEmpty() && s.peek()==op[j]){
               ans[j]=s.pop();
               j++;
            }
            else if(!s.isEmpty() && s.peek()!=op[j] && i>=n){
                return 0;
            }
            else{
                s.push(ip[i]);
                i++;
            }
            
        }
        if(Arrays.equals(ans,op)){
            return 1;
        }
       return 0; 
    }
}
