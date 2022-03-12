class Solution {
     static int checkMirrorTree(int n, int e, int[] A, int[] B) {
       // code here
        HashMap<Integer,Stack<Integer>> mp = new HashMap<Integer,Stack<Integer>>();
        for(int i=0;i<A.length-1;i++){
            if(mp.containsKey(A[i])){
                Stack<Integer> ls = mp.get(A[i]);
                ls.push(A[i+1]);
                mp.put(A[i],ls);
            }
            else{
                Stack<Integer> ls = new Stack<Integer>();
                ls.push(A[i+1]);
                mp.put(A[i],ls);
            }
            i++;
        }
       
        for(int i=0;i<B.length-1;i++){
            if(!mp.containsKey(B[i])){
                return 0;
            }
            else{
                Stack<Integer> ls = new Stack<Integer>();
                ls = mp.get(B[i]);
                if(ls.pop()!=B[i+1]){
                   return 0;
                }
                mp.put(B[i],ls);
            }
            i++;
        }
        return 1;
   }
};
