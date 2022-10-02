// as median we have to divide values in array
// left side (some of nums1 and some of nums2)
// right side (some of nums1 and some of nums2)

class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        //taking nums2 bigger always (bcz we taking values from nums2)
        //so to not get index out of bound
        if(arr2.length<arr1.length)   return findMedianSortedArrays(arr2,arr1);
        
        int n=arr1.length, m=arr2.length;
        int l=0, r=n, k = (n+m+1)/2;
        // int l = Math.max(0,k-n), r = Math.min(k,m);
        
        // for(int i:arr1) System.out.print(i+" ");
        // System.out.println();
        // for(int i:arr2) System.out.print(i+" ");
        // System.out.println();
        
        
        while(l<=r){
            
            int cut1=l+(r-l)/2;
            int cut2=k-cut1;
            
            int l1=cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=cut2==0?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=cut1==n?Integer.MAX_VALUE:arr1[cut1];
            int r2=cut2==m?Integer.MAX_VALUE:arr2[cut2];
            
            
            // System.out.println("l & r=> "+l+" "+r+"\n"+
            // "cut1 & cut2 => "+cut1+" "+cut2+"\n"+
            // "left half=> "+Math.min(l1,l2)+" "+Math.max(l1,l2)+"\n"+
            // "right half=> "+Math.min(r1,r2)+" "+Math.max(r1,r2));
            
            if(l1<=r2 && l2<=r1){
                // System.out.print(l1+" ")
                if((n+m)%2==0){
                    // System.out.println(l1+" "+l2+" "+r1+" "+r2);
                    return ( Math.max(l1,l2) + Math.min(r1,r2) )/2.0;
                }else{
                    //odd length
                    return Math.max(l1,l2);
                }
            }
            
            else if(l1>r2){
                r=cut1-1;
            }
            
            else if(l2>r1){
                l=cut1+1;
            }
            
        }
        return 1L;
        
    }
}
