public class Solution {
    public int solve(String A) {
        int h= (A.charAt(0)-'0')*10 + (A.charAt(1)-'0');
        int r= (A.charAt(1)-'0')*10 + (A.charAt(0)-'0');
        int m=(A.charAt(3)-'0')*10 + (A.charAt(4)-'0');
        int ans=0;
        if(r>=m && r<60) return r-m;
        else{
        h=(h+1)%24;
        ans+=60-m;
        if(h>=10 && (h<16 || h>=20)){
           r=(h%10)*10 + h/10;
            if(r==10)
                r=1;
        }else if(h>=16){
           ans+=(20-h)*60;
           r=2;
        }

       else if(h<6)

       r=h*10;

       else

       {

           ans+=(10-h)*60;

           r=1;

       }

       

    }

    return ans+r;


}
}
