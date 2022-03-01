class Solution 
{ 
    long countPairs(int N, int X, int numbers[]) 
    { 
        // code here
        long c=0;
        Map<String,Integer> a=new HashMap<String,Integer>();
        for(int i=0;i<N;i++){
            String h=numbers[i]+"";
            a.put(h,a.getOrDefault(h,0)+1);
        }
        String l=X+"";
        int len=l.length();
        for(int i=1;i<len;i++){
            String h1=l.substring(0,i);
            String h2=l.substring(i,len);
            if(a.containsKey(h1) && a.containsKey(h2)){
                if(h1.equals(h2)){
                    int y=a.get(h1);
                    c+=y*(y-1);
                }else
                    c+=a.get(h1)*a.get(h2);
                }
        }
        return c; 
    }
} 
