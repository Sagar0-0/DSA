//O(n)
//O(n)
class Solution
{
    char firstRep(String S)
    {
        // your code here
        Map<Character,Integer> map=new HasMap<>();
        for(char c:S.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
        
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(map.get(c)>1)return c;
        }
        return '#';
        
    }
}

//O(n)
//O(1)
class Solution
{
    char firstRep(String S)
    {
        
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            String temp=S.substring(i+1);
            if(temp.indexOf(c)!=-1){
                return c;
            }
        }
        return '#';
        
    }
}
