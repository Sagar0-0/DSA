public class Solution {
    public String minWindow(String A, String B) {
        int want=B.length();
        int count=0;
        StringBuilder sb=new StringBuilder();
        String ans=null;
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> curr=new HashMap<>();
        for(char c:B.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int i=0;
        int j=0;
        while(j<A.length()){
            if(count==want){
                if(ans==null || ans.length()>sb.length()){
                    ans=sb.toString();
                }
                char c=A.charAt(j);
                sb.deleteCharAt(0);
                curr.put(c,curr.get(c)-1);
                if(!map.containsKey(c)){
                    j++;
                    continue;
                }
                if(curr.get(c)<map.get(c)){
                    count--;
                }
                j++;
            }else{
                if(i==A.length())break;
                char c=A.charAt(i);
                sb.append(c);
                curr.put(c,curr.getOrDefault(c,0)+1);
                if(!map.containsKey(c)){
                    i++;
                    continue;
                }
                if(curr.get(c)<=map.get(c)){
                    count++;
                }
                i++;
            }
        }
        return ans==null?"":ans;
    }
}
