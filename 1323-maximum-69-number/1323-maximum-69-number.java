class Solution {
    public int maximum69Number (int num) {
        char[] arr=(String.valueOf(num)).toCharArray();
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(c=='6'){
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}