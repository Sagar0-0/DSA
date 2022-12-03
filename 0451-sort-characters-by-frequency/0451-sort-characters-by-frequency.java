class Solution {
    public String frequencySort(String s) {
        int[] a = new int[750];
        
        for(int i=0;i<s.length();i++)
            a[s.charAt(i)-48]++;
        
        StringBuffer sb = new StringBuffer();
        while(sb.length()!=s.length())
        {
            int max_freq=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>a[max_freq])
                    max_freq=i;
            }
            sb.append(String.valueOf((char)(max_freq+48)).repeat(a[max_freq]));
            a[max_freq]=0; 
        }
        return sb.toString();
    }
}