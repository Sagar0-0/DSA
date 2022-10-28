class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>>aa=new ArrayList<List<String>>();
        if(arr.length==0){
            return aa;
        }
        else if(arr.length==1){
            ArrayList<String>ab=new ArrayList<String>();
            ab.add(arr[0]);
            aa.add(ab);
            return aa;
        }
        else{
            HashMap<String,ArrayList<String>>map=new HashMap<String,ArrayList<String>>();
            for(String a:arr){
                ArrayList<Character>ab=new ArrayList<Character>();
                for(int i=0;i<a.length();i++){
                    ab.add(a.charAt(i));
                }
                Collections.sort(ab);
                String s="";
                for(char a1:ab){
                    s=s+a1;
                }
                if(map.containsKey(s)){
                    ArrayList<String>ac=new ArrayList<String>();
                    ac=map.get(s);
                    ac.add(a);
                    map.put(s,ac);
                }
                else{
                     ArrayList<String>ac=new ArrayList<String>();
                    ac.add(a);
                    map.put(s,ac);
                }
            }
            for(String a:map.keySet()){
                ArrayList<String>ac=new ArrayList<String>();
                ac=map.get(a);
                aa.add(ac);
            }
            return aa;
        }
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
Time Complexity:O((Number Of Strings)*(String length*log(String length)))[Taking one string one by one from given array and sorting it.]

Space Complexity:O(N)(As Array of String is used)

Auxiliary Space:O(N)[In worst case of no anagram, all the strings will be stored in the map and that later will get stored as 
seperate arraylist in collection of arraylists which will be returned as final answer.]

Total Test Cases:117
  
LeetCode Time:60 ms faster than 12.32%

LeetCode Memory:62.6 MB less than 12.89%
