class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[]arr=s.toCharArray();
        while(i<j){
            while(i<j && !vowel(arr[i]))i++;
            while(j>i && !vowel(arr[j]))j--;
            if(i>j)break;
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    boolean vowel(char c){
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
        
    }
}