
=======
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

Approach 2:

class Solution { 

    public int minLength(String s1, int n) { 
    	Stack<Character>stack=new Stack<Character>();
    	
    	for(int i=0;i<s1.length();i++){
    	    if(stack.isEmpty()){
    	        stack.push((s1.charAt(i)));
    	    }
    	    else{
    	        String s="";
    	        s+=(stack.peek());
    	        s+=(s1.charAt(i));
    	        if(s.equals("12") || s.equals("21") || s.equals("34") || s.equals("43")|| s.equals("56") || s.equals("65")|| s.equals("78") || s.equals("87") || s.equals("90") || s.equals("09")){
    	            
    	            stack.pop();
    	        }
    	        else{
    	            stack.push((s1.charAt(i)));
    	        }
    	    }
    	}
    	return stack.size();
    }
}

/*
Note:

Total Time Taken:O(N)[Traversal of String and Comparing with the given strings.]

GFG Time: 0.8

Auxiliary Space:O(N)[Stack is used][In worst Case all characters will be there in the stack.]

Total Test Cases:210
*/

