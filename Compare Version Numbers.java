class Solution {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int max = Math.max(str1.length,str2.length);
        for(int i=0;i<max;i++){
            int num1 = i >= str1.length ? 0 : Integer.parseInt(str1[i]);
            int num2 = i >= str2.length ? 0 : Integer.parseInt(str2[i]);
            if(num1 < num2) return -1;
            if(num1 > num2) return 1;
        }

        return 0;
    }
}

//==================================================================================
//Two pointer (Faster)
public class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int currentVersion1, currentVersion2;
        while(i < version1.length() || j < version2.length()) {
            currentVersion1 = 0;
            while(i < version1.length() && version1.charAt(i) != '.'){
                currentVersion1 = currentVersion1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            
            currentVersion2 = 0;
            while(j < version2.length() && version2.charAt(j) != '.'){
                currentVersion2 = currentVersion2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            
            if(currentVersion1 > currentVersion2)
                return 1;
            if(currentVersion2 > currentVersion1)
                return -1;
            i++;
            j++;
        }
        
        return 0;
    }
}
