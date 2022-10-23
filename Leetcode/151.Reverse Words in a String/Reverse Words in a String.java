class Solution {
    public String reverseWords(String s) {
      
        String s1=s.trim();
        StringBuilder sb=new StringBuilder();
        ArrayList<String>aa=new ArrayList<String>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                if(sb.length()!=0){
                    aa.add(sb.toString());
                    sb.setLength(0);
                }
                i++;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        if(sb.length()!=0){
            aa.add(sb.toString());
        }
        sb.setLength(0);
        for(int i1=aa.size()-1;i1>-1;i1--){
            sb.append(aa.get(i1));
            sb.append(" ");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}
