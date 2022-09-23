class Solution { 
    public int minLength(String s, int n) { 
    	// code here
    	Stack<Integer>st=new Stack<>();
    	int pair[]=new int[]{9,2,1,4,3,6,5,8,7,0};
    	for(char ch:s.toCharArray()){
    	    int key=ch-'0';
    	    if(st.size()==0){
    	        st.push(key);
    	    }else{
    	        if(st.peek()==pair[key]){
    	            st.pop();
    	        }else{
    	            st.push(key);
    	        }
    	    }
    	}
    	return st.size();
    }
}


//Method2 using hashset and stack

class Solution { 
    public int minLength(String s, int n) { 
        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(21);
        hs.add(34);
        hs.add(43);
        hs.add(56);
        hs.add(65);
        hs.add(78);
        hs.add(87);
        hs.add(9);
        hs.add(90);
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++) {
            st.add(s.charAt(i)-'0');
            
            Integer top=-1;
            Integer prevTop=-1;
            while(st.size()>=2 && ((top==-1 && prevTop==-1) || hs.contains(prevTop*10+top))) {
                top=st.pop();
                prevTop=st.pop();
            }
            if((top!=-1 && prevTop!=-1) && !hs.contains(prevTop*10+top)) {
                st.add(prevTop);
                st.add(top);
            }
        }
        
        return st.size();

    }
}
