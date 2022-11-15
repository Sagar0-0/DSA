Using StringBuilder Objects:

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
         StringBuilder sb2=new StringBuilder();
        
        for(String a:word1){
            sb1.append(a);
        }
        
        
        for(String a:word2){
            sb2.append(a);
        }
        
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;
        
        
        
    }
}

=======================================================================================================================================================================
  
Without Using StringBuilder objects:

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum=null;
        String sum2=null;
        
        for(int i=0;i<word1.length;i++)
        {
            sum=sum+word1[i];
        }
        for(int i=0;i<word2.length;i++)
        {
            sum2=sum2+word2[i];
        }
        if(sum.equals(sum2))
            return true;
        else
            return false;
    }
}

