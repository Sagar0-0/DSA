class Solution{
    static String ReFormatString(String s, int k){
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='-'){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
                sb2.append(Character.toUpperCase(s.charAt(i)));
            }
                
        }
        if(sb.length()<k){
            
            return sb2.toString();
        }
        StringBuilder sb1=new StringBuilder();
        int count=0;
        
        for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)!='-'){
               if(count==k){
                   count=01;
                   sb1.append("-");
                   sb1.append(sb.charAt(i));
               }
               else{
                   count++;
                   sb1.append(sb.charAt(i));
               }
           }
           
        }
        sb1.reverse();
        return sb1.toString();
        
        
    }
}
