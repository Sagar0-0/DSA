class Solution
{
    boolean[] prime;
    Solution()
    {
        prime =new boolean[10000];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for(int i=2;i<10000;i++){
            if(!prime[i])continue;
            for(int j=2;i*j<10000;j++)prime[i*j]=false;
        }
        // Every index of prime stores zero or one
        // If prime[i] is zero means i is not a prime
        // If prime[i] is one means i is a prime
    }
    
    public int shortestPath(int Num1,int Num2){
        // Complete this function using prime array
        
        boolean[]vis=new boolean[10000];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{Num1,0});
        vis[Num1]=true;
        while(!q.isEmpty()){
            int[] curr=q.remove();
            if(curr[0]==Num2)return curr[1];
            
            char[] arr= Integer.toString(curr[0]).toCharArray();
            for(int i=0;i<4;i++){
                for(char ch='0';ch<='9';ch++){
                    char prevChar = arr[i];
                    arr[i]=ch;
                    int newNum = Integer.parseInt(new String(arr));
                    if(!vis[newNum] && prime[newNum] && newNum>=1000){
                        vis[newNum]=true;
                        q.add(new int[]{newNum,curr[1]+1});
                    }
                    arr[i]=prevChar;
                }
            }
        }
        return -1;
    }
}
