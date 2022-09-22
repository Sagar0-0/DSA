public class Solution {
    public int solve(int A, int B, int C) {
          int i;
    ArrayList<Integer> pal=new ArrayList<>();
    for(i=A;i<=B;i++)
    {
        if(check(Integer.toString(i)))pal.add(i);
    }
    // int ans=0;/
    int l=0;
    int n=pal.size();
    int ans=0;
    i=0;
    while(i<n)
    {
        while(i<n&&pal.get(i)-pal.get(l)<=C)i++;
        ans=Math.max(ans,i-l);
        if(i==n)break;
        while(l<n&&pal.get(i)-pal.get(l)>C)l++;
    }
    return ans;
    }
    boolean check(String s)
{
    int n=s.length();
    int i;
    for(i=0;i<n/2;i++)
    {
    if(s.charAt(i)!=s.charAt(n-i-1))return false;
    }
    return true;
}
}
