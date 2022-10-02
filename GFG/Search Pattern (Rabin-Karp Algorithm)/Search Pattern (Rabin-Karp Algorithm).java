class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        int total=26, mod=101;
        ArrayList<Integer> list=new ArrayList<>();
        int p=0, s=0, sn=S.length(), pn=pat.length();
        
        // calculate most significant position
        // (we will need this when we have to remove most signicant position value)
        // The value of h would be "pow(d, M-1)%q"
        int h = 1; 
        for (int i = 0; i < pn-1; i++)
            h = (h*total)%mod;
        
        // System.out.println(h);

        for(int i=0;i<pn;i++){
            
            // pattern string hash
            p = ( p*total + pat.charAt(i) ) % mod;
            
            // first window hash
            s = ( s*total + S.charAt(i) ) % mod;
        }
        
        for(int i=0;i<=sn-pn;i++){
        
            // hash are equal
            if(p==s && compare(pat,S,i))    list.add(i+1);
            
            // rolling hash
            // remove a value from most significant position & 
            // add new value to the least significant position
            if(i+pn<sn)     s=( (s-S.charAt(i)*h)*total + S.charAt(i+pn))%mod;
            if(s<0)     s+=mod;
        }
        
        if(list.isEmpty())  list.add(-1);
        return list;
    }
    
    boolean compare(String p,String s,int st){
        for(int i=0;i<p.length();i++)
            if(p.charAt(i)!=s.charAt(i+st)) return false;
        return true;
    }
}
