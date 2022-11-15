class Solution
{
    public String newIPAdd(String S)
    {
        // your code here
        String[]arr=S.split("\\.");
        for(int j=0;j<arr.length;j++){
            String s=arr[j];
            int index=-1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='0'){
                    index=i;
                    break;
                }
            }
            if(index==-1){
                arr[j]="0";
            }else{
                arr[j]=s.substring(index,s.length());
            }
        }
        S="";
        S+=arr[0];
        for(int i=1;i<arr.length;i++){
            S+="."+arr[i];
        }
        return S;
    }
}
