class Solution{
    static Set<Integer> set=new HashSet<>();
    
    static List<Integer> primeDivision(int n){
        // code here
        List<Integer> ans=new ArrayList<>();
        for(int i=2;i<n;i++){
            if(set.contains(i) || isPrime(i)){
                if(set.contains(n-i) || isPrime(n-i)){
                    ans.add(i);
                    ans.add(n-i);
                    break;
                }
            }
        }
        return ans;
    }
    
    static boolean isPrime(int n){
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3){
            set.add(n);
            return true;
        }
  
        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;
  
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        
        set.add(n);
        return true;
    }
}
