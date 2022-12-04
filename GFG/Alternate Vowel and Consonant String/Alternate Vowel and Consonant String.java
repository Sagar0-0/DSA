class Solution{
    public String rearrange(String S, int N){
        int[]vowels=new int[26];
        int[]cosonants =new int[26];
        int noOfVowels=0;
        int noOfCons=0;
        char smallestVowel='u';
        char smallestCons='z';
        
        for(char c:S.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels[c-'a']++;
                noOfVowels++;
                smallestVowel=(char)Math.min((int)smallestVowel,(int)c);
            }else{
                cosonants[c-'a']++;
                noOfCons++;
                smallestCons=(char)Math.min((int)smallestCons,(int)c);
            }
        }
        
        if(Math.abs(noOfVowels-noOfCons)>1)return "-1";
        
        boolean isVowel=false;
        
        if(noOfVowels>noOfCons){
            isVowel=true;
        }else if(noOfCons>noOfVowels){
            isVowel=false;
        }else{
            if(smallestVowel<smallestCons){
                isVowel=true;
            }else{
                isVowel=false;    
            }
        }
        
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<26 && j<26){
            if(isVowel){
                while(i<26 && vowels[i]==0)i++;
                if(i==26)break;
                sb.append((char)('a'+i));
                vowels[i]--;
                isVowel=false;
            }else{
                while(j<26 && cosonants[j]==0)j++;
                if(j==26)break;
                sb.append((char)('a'+j));
                cosonants[j]--;
                isVowel=true;
            }
        }
        return sb.toString();
    }
}

//User function Template for Java

class Solution{
    public String rearrange(String S, int N){
        int vowels = countVowels(S, true);
        int consonants = countVowels(S, false);
        
        int f[]=new int[26];
        char firstVowel=Character.MAX_VALUE;
        char firstConsonant=Character.MAX_VALUE;
        for(int i=0;i<S.length();i++) {
            f[S.charAt(i)-'a'] += 1;
            if(S.charAt(i)=='a' || S.charAt(i)=='e' || S.charAt(i)=='i'|| S.charAt(i)=='o' || S.charAt(i)=='u') {
                if(firstVowel > S.charAt(i)) {
                    firstVowel = S.charAt(i);
                }
            }
            else {
                if(firstConsonant > S.charAt(i)) {
                    firstConsonant = S.charAt(i);
                }
            }
        }
        
        int j=firstConsonant -'a';
        int i=firstVowel -'a';
        
        StringBuilder sb = new StringBuilder();
        
        if(S.length()%2==0) {
            if(vowels!=consonants) return "-1";
            if(firstVowel < firstConsonant) {
                sb.append(firstVowel);
                f[firstVowel - 'a']-=1;
            }
            return getRes(f, i, j, sb);
        }
        else {
           
            if(Math.abs(vowels-consonants) > 1) {
                return "-1";
            }
            
            if(vowels-consonants==1) {
                sb.append(firstVowel);
                f[firstVowel - 'a']-=1;
            }
            
            return getRes(f, i, j, sb);
        }
    }
    
    public String getRes(int []f, int i, int j, StringBuilder sb) {
        while(j<26) {
                if(f[j]==0) {
                    j+=1;
                    continue;
                }
                else {
                    if(j==0 || j==4 || j==8 || j==14 || j==20) {
                        j+=1;
                        continue;
                    }
                    else {
                        sb.append((char)('a'+j));
                        f[j]-=1;
                    }
                }
                
                
                
                if(f[i]==0) {
                    i=getNextVowel(f);
                }
                if(i!=-1) {
                    sb.append((char)('a'+i));
                    f[i]-=1;
                }
                else {
                    break;
                }
                
        }
        return sb.toString();
    }
    
    public int getNextVowel(int f[]) {
        if(f[0]!=0) return 0;
        if(f[4]!=0) return 4;
        if(f[8]!=0) return 8;
        if(f[14]!=0) return 14;
        if(f[20]!=0) return 20;
        return -1;
    }
    public int countVowels(String s, boolean isVowel) {
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(isVowel && (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u')) {
                count+=1;
            }
            else if(!isVowel && !(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')) {
                count+=1;
            }
        }
        return count;
    }
}
