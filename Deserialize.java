public class Solution {
    public ArrayList<String> deserialize(String A) {
        int i=0;
        ArrayList<String> arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        while(i<A.length()){
            if(A.charAt(i)>='0' && A.charAt(i)<='9'){
                arr.add(sb.toString());
                sb.setLength(0);
                while(A.charAt(i)<'a')i++;
            }else if(A.charAt(i)=='~'){
                i++;
            }else{
                sb.append(A.charAt(i));
                i++;
            }
        }
        return arr;
    }
}
