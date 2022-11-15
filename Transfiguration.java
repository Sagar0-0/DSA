class Solution
{
    int transfigure (String A, String B)
    {
    	// Your code goes here.
    	if(A.length()!=B.length())
            return -1;  
            
        int sum=0;
        for(int i=0;i<A.length();i++){
            sum=sum+A.charAt(i);
            sum=sum-B.charAt(i);
        }
        if(sum!=0)
            return -1;
            
        int n1=A.length()-1;
        int n2=B.length()-1;
        int res=0;
    	 while(n1>=0 && n2>=0){
            if(A.charAt(n1)==B.charAt(n2)){
                n1--;
                n2--;
            }else{
                n1--;
                res++;
            }
        }
        return res;
    }
}
