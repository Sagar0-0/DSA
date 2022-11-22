class Trie{
    Map<Character,Set<String>> map;
    Map<Character,Trie> next;
    Trie(){
        map=new HashMap<>();
        next=new HashMap<>();
    }
}


class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here 
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        Trie head=new Trie();
        
        //create trie
        for(String st:contact){
            Trie curr=head;
            for(char c:st.toCharArray()){
                curr.map.putIfAbsent(c,new TreeSet<>());
                curr.map.get(c).add(st);
                curr.next.putIfAbsent(c,new Trie());
                curr=curr.next.get(c);
            }
        }
        
        Trie curr=head;
        for(int i=0;i<s.length();i++){
            ArrayList<String> list=new ArrayList<>();
            if(curr.map.containsKey(s.charAt(i))){
                for(String str:curr.map.get(s.charAt(i))){
                    list.add(str);
                }
            }
            if(list.size()==0)list.add("0");
            ans.add(list);
            
            if(curr.next.containsKey(s.charAt(i))){
                curr=curr.next.get(s.charAt(i));
            }else{
                break;
            }
        }
        while(ans.size()!=s.length()){
            ArrayList<String> list=new ArrayList<>();
            list.add("0");
            ans.add(list);
        }
        return ans;
        
    }
}




//Method 2

class Solution{
    static class Trie {
        Trie child[]=new Trie[26];
        Boolean word[]=new Boolean[26];
    }
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        Trie head = new Trie();
        for(int i=0;i<contact.length;i++) {
            Trie cur = head;
            for(int j=0;j<contact[i].length();j++) {
                if(cur.child[contact[i].charAt(j)-'a'] != null) {
                    cur=cur.child[contact[i].charAt(j)-'a'];
                }
                else {
                    cur.child[contact[i].charAt(j)-'a'] = new Trie();
                    cur=cur.child[contact[i].charAt(j)-'a'];
                }
            }
            cur.word[contact[i].charAt(contact[i].length()-1)-'a'] = true;  // For last character in word made it to true 
        }
        
        for(int i=0;i<s.length();i++) {
            StringBuilder sb=new StringBuilder();
            Trie cur = head;
            int flag=0;
            for(int j=0;j<=i;j++) {
                if(cur.child[s.charAt(j)-'a']!=null) {
                    sb.append(s.charAt(j));
                    cur=cur.child[s.charAt(j)-'a'];
                }
                else {
                    flag=1;
                    break;
                }
            }
            ArrayList<String> curList=new ArrayList<>();
            if(flag==1) {  // No string found with prefix
               curList.add("0");
               res.add(curList);
                continue;
            }
            if( cur.word[s.charAt(i)-'a']!=null && cur.word[s.charAt(i)-'a'] == true) {
                curList.add(new String(sb.toString()));
            }
            findAllPrefixes(cur, sb, curList); 
            if(curList.size()>0)  // Adding all words which start with prefix 0-i of String s.
                res.add(curList);
            else {
                curList.add("0");
                res.add(curList);
            }
                
        }
        return res;
    }
    public static int  findAllPrefixes(Trie cur, StringBuilder sb, ArrayList<String> curList) {   // Adding all words which start with the preficx from o-i of string s, storing in curList
        int childVis = -1;
        for(int i=0;i<26;i++) {
            if(cur.child[i]!=null && childVis!=i) {
                sb.append(""+(char)(i+'a'));
                if(cur.child[i].word[i]!=null && cur.child[i].word[i]==true) {
                    curList.add(new String(sb.toString()));
                }
                childVis=findAllPrefixes(cur.child[i], sb, curList);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return -1;
    }
}
