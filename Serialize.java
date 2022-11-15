public class Solution {
    public String serialize(ArrayList<String> A) {
        StringBuilder sb=new StringBuilder();
        for(String s:A){
            sb.append(s);
            sb.append(s.length());
            sb.append("~");
        }
        return sb.toString();
    }
}
