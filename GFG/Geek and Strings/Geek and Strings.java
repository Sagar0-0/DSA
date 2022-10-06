class Solution{
    static class Trie {
        Trie child[]=new Trie[26];
        int count[]=new int[26];
    }
    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
        // code here
        List<Integer> res=new ArrayList<>();
        Trie head=null;
        head=new Trie();
        Trie cur=head;
        for(int i=0;i<li.length;i++) {
            String s=li[i];
            cur=head;
            for(int j=0;j<s.length();j++) {  //inserting every string into the trie
                if(cur.child[s.charAt(j)-'a']!=null) {
                    cur=cur.child[s.charAt(j)-'a'];
                }
                else {
                    cur.child[s.charAt(j)-'a']=new Trie();
                    cur=cur.child[s.charAt(j)-'a'];
                }
                cur.count[s.charAt(j)-'a']+=1;
            }
        }
        
        for(int i=0;i<query.length;i++) {
            String s=query[i];
            cur=head;
            int exist=1;
            for(int j=0;j<s.length();j++) {
                cur=cur.child[s.charAt(j)-'a'];
                if(cur==null) { // if cur==null then there is no prefix with string breaking
                    exist=0;
                    break;
                }
            }
            if(exist==1) //if string exist then adding count of last character(how many strings present until last character) to res
                res.add(cur.count[s.charAt(s.length()-1)-'a']);
            else //else adding 0 as there is no prefix with string
                res.add(0);
        }
        return res;
    }
}
