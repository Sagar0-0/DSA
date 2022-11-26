class Solution {
    public static Node treeFromString(String s) {
        // code here
        int[] idx=new int[]{0};
        return dfs(idx,s);
    }
    static Node dfs(int[] idx,String s){
        if(idx[0]>=s.length() || s.charAt(idx[0])==')'){
            idx[0]++;
            return null;
        }
        
        int num=0;
        while(idx[0]<s.length() && Character.isDigit(s.charAt(idx[0]))){
            num=num*10+(s.charAt(idx[0])-'0');
            idx[0]++;
        }
        Node head=new Node(num);
        if(idx[0]<s.length() && s.charAt(idx[0])=='('){
            idx[0]++;
            head.left=dfs(idx,s);
        }
        if(idx[0]<s.length() && s.charAt(idx[0])=='('){
            idx[0]++;
            head.right=dfs(idx,s);
        }
        idx[0]++;
        
        return head;
    }
}
     
