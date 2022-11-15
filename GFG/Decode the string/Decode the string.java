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


//Method 2 Using single stack


class Solution{
    static String decodedString(String s){
        // code here
        Stack<StringBuilder> st=new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=']') {
                StringBuilder sb1=new StringBuilder(""+s.charAt(i));
                st.push(sb1);
            }
            else {
                StringBuilder sb=new StringBuilder();
                StringBuilder num=new StringBuilder();
                while(!st.isEmpty() && (st.peek().length()>1 || (st.peek().length()==1 && st.peek().charAt(0)!='['))) { //popping all and adding to sb until we come across '['
                    sb.append(st.pop());
                }
                st.pop();
                while(!st.isEmpty() && 
                    (st.peek().length()==1 && st.peek().charAt(0)>='0' && st.peek().charAt(0)<='9')) { 
                    num.append(""+st.pop());
                }
               
                int times=1;
                if(num.length()>0)
                    times=Integer.valueOf(num.reverse().toString());
                    
                StringBuilder toAppend=new StringBuilder();
                for(int j=0;j<times;j++) {
                    toAppend.append(sb);
                }
                st.push(toAppend);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()) {
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}
