/* 
Question to Problem:

Given a number (n) and no. of digits (m) to represent the number, we have to check if we can represent n 
using exactly m digits in any base from 2 to 32.

Example 1:

Input: n = 8, m = 2
Output: Yes 
Explanation: Possible in base 3 as 8 in base 3 is 22.  

Example 2:

Input: n = 8, m = 3
Output: No
Explanation: Not possible in any base. 

*/
class Solution
{
    String baseEquiv(int n, int m)
    {
        // code here 
        int start=2;
        int end=32;
        while(start<=end) {
            int mid=(start+end)/2;
            int digits=calculateDigits(n, mid);
            if(digits<m) end=mid-1;
            else if(digits>m) start=mid+1;
            else return "Yes";
        }
        return "No";
    }
    public int calculateDigits(int n, int m) {
        int dig=0;
        while(n>0) {
            dig+=1;
            n=n/m;
        }
        return dig;
    }
}
