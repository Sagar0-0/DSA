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
