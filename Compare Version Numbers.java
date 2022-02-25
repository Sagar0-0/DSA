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
