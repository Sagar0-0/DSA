class Trie{
   Trie[] children;
   int count;
   
   Trie(){
       children = new Trie[26];
       count = 0;
   }
   static void insert(Trie root, String s){
       Trie temp = root;
       for(char ch : s.toCharArray()){
           int index = ch-'a';
           if(temp.children[index] == null){
              temp.children[index] = new Trie();
           }
          temp.children[index].count++;
          temp = temp.children[index];
       }
   }
   static String searchPrefix(Trie root, String s){
       StringBuilder ans = new StringBuilder();
       Trie temp = root;
       for(char ch : s.toCharArray()){
           int index = ch-'a';
           ans.append(ch);
           if(temp.children[index].count == 1){
               break;
           }
           temp = temp.children[index];
       }
       return ans.toString();
   }
}

class Solution {
    static String[] findPrefixes(String[] arr, int n) {
        // code here
        String[]ans=new String[n];
        Trie root=new Trie();
        for(String s:arr){
            Trie.insert(root,s);
        }
        for(int i=0;i<n;i++){
            String prefix=Trie.searchPrefix(root,arr[i]);
            ans[i]=prefix;
        }
        return ans;
    }
};
