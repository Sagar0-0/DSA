class Solution

{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        
        int upper=-1;
        int lower=-1;
        
        if(arr[0]<97){
            upper=0;
        }
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(ch>=97){
                lower=i;
                break;
            }
        }
        
        if(upper==-1 || lower==-1)return new String(arr);
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=97){
                sb.append(arr[lower]);
                lower++;
            }else{
                sb.append(arr[upper]);
                upper++;
            }
        }
        return sb.toString();
    }
}
