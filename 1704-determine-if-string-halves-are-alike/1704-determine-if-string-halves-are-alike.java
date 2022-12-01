class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0;
        int b=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i<n/2){
                a+=get(s.charAt(i));
            }else{
                b+=get(s.charAt(i));
            }
        }
        return a==b;
    }
    int get(char c){
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return 1;
            default:
                return 0;
        }
    }
}