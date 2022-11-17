class Solution {
    public String reverseWords(String s) {
        List<StringBuilder> arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        boolean word=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
                word=true;
            }else{
                if(word){
                    word=false;   
                    arr.add(sb);
                    sb=new StringBuilder();
                }
            }
        }
        if(sb.length()>0)arr.add(sb);
        sb=new StringBuilder();
        for(int i=arr.size()-1;i>=0;i--){
            sb.append(arr.get(i));
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}