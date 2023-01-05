class TrieNode{
    boolean isEnd;
    TrieNode[] arr;
    TrieNode(){
        isEnd=false;
        arr = new TrieNode[26];
    }
}


class Solution {
    static TrieNode root;
    public static String longestString(int n, String[] arr) {
        // code here
        root=new TrieNode();
        for(String s:arr){
            insert(s);
        }
        String ans="";
        for(String s:arr){
            if(s.length()<ans.length()){
                continue;
            }else{
                if(isPresent(s)){
                    if(s.length()>ans.length()){
                        ans=s;
                    }else if(s.length()==ans.length()){
                        if(s.compareTo(ans)<0){
                            ans=s;
                        }
                    }
                }
            }
        }
        return ans;
        
    }
    
    static boolean isPresent(String s){
        TrieNode curr=root;
        for(char c:s.toCharArray()){
            int index=c-'a';
            curr=curr.arr[index];
            if(curr.isEnd==false)return false;
        }
        return true;
    }
    
    static void insert(String s){
        TrieNode curr=root;
        for(char c:s.toCharArray()){
            int index=c-'a';
            if(curr.arr[index]==null){
                curr.arr[index]=new TrieNode();
            }
            curr=curr.arr[index];
        }
        curr.isEnd=true;
    }
}
