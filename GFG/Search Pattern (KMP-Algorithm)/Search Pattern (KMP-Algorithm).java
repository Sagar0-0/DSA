class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        int pn=pat.length(), tn=txt.length();
        int lps[]=new int[pn];
        fill(lps,pat,pn);
        ArrayList<Integer> list=new ArrayList<>();
        
        int j=0;
        for(int i=0;i<tn;){
            
            //character match check for next
            if(pat.charAt(j)==txt.charAt(i)){
                j++;
                i++;
            }
            
            //if j reached end
            if(j==pn){
                
                //there's a substring
                list.add(i-pn+1);
                
                // if there is a similar substring present in pattern then
                // j will go to that position
                // in other words
                // j is at the end so just say j and i is not similar (as j exhausted)
                // and j-1 prefix array is similar
                // so j will go to that position where prefix is similar
                // e.g. aabaab      lps[]={0,1,0,1,2,3}
                j=lps[j-1];
            }
            else if(i<tn && pat.charAt(j)!=txt.charAt(i)){
                
                //this character is not same but prefix is same 
                //we go to the index where prefix is same 
                //only j char is not same but j-1 prefix is same
                //we check for same prefix (j-1) index
                if(j!=0)   j=lps[j-1];
                
                //if j is at initial postion so there is no similar string back in patter
                //so we have no other option except for check next char in text string
                else{
                    i++;
                }
            }
        }
        
        if(list.isEmpty())  list.add(-1);
        return list;
    }
    void fill(int lps[],String s,int pn){
        
        //assume 1 based indexing we are filling 
        //bat (indexing 1,2,3)  we will fill according to this
        
        //aabaab    string index[]={0,1,2,3,4,5}
        //lps will track longest prefix substring
        //aabaab    lps[]={0,1,0,1,2,3}     as we are filling according to 1 based indexing
        
        int si=0;
        for(int i=1;i<pn;){
            if(s.charAt(si)==s.charAt(i)){
                
                //0 and 1 is equal
                //means this value is similar to si index
                //but we are filling according to 1 based indexing so just added 1 before that
                //next step since index value same so check for next
                si++;
                lps[i]=si;
                i++;
                
            }else{
                
                //si char not same
                //if first character is not same then we can't do anthing just move i pointer
                //and check for next char
                if(si==0)  i++;
                
                //only si char is not same
                //but till si-1 prefix substring is same
                //in naive approach we go to start
                //but in this case we know whether there is a similar substring present or not
                //so we go to that position
                else    si=lps[si-1];
            }
        }
    }
    
}
