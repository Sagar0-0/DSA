class Solution{
    static String decodedString(String s){
        // code here
        Stack<Integer> nums=new Stack<>();
        Stack<String> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int n=0;
                while(s.charAt(i)>='0' && s.charAt(i)<='9'){
                    n=n*10+(s.charAt(i)-'0');
                    i++;
                }
                nums.push(n);
            }else{
                if(s.charAt(i)==']'){
                    int n=nums.pop();
                    StringBuilder inner=new StringBuilder();
                    while(!st.peek().equals("[")){
                        inner.append(st.pop());
                    }
                    st.pop();
                    StringBuilder newStr=new StringBuilder();
                    while(n>0){
                        newStr.append(inner);
                        n--;
                    }
                    st.push(newStr.toString());
                }else{
                    st.push(""+s.charAt(i));
                }
                i++;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
