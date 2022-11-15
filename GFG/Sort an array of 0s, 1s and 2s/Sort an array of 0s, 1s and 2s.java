class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zero=0;
        int one=0;
        int two=0;
        for(int i:a){
            if(i==0){
                zero++;
            }else if(i==1){
                one++;
            }else{
                two++;
            }
        }
        
        int idx=0;
        while(zero>0){
            zero--;
            a[idx++]=0;
        }
        while(one-->0){
            a[idx]=1;
            idx++;
        }
        while(two-->0){
            a[idx++]=2;
        }
    }
}
