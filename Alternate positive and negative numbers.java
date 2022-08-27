class Solution {
    void rearrange(int arr[], int n) {
        // code here
        boolean needNeg=false;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                //need pos
                if(needNeg==false){
                    needNeg=true;
                }else{
                    //find neg
                    int j=i+1;
                    while(j<n && arr[j]>=0){
                        j++;
                    }
                    if(j==n)return;
                    int ele=arr[j];
                    j--;
                    while(j>=i){
                        arr[j+1]=arr[j];
                        j--;
                    }
                    arr[i]=ele;
                    needNeg=false;
                }
            }else{
                //needed neg
                if(needNeg==true){
                    needNeg=false;
                }else{
                    //find pos
                    int j=i+1;
                    while(j<n && arr[j]<0){
                        j++;
                    }
                    if(j==n)return;
                    int ele=arr[j];
                    j--;
                    while(j>=i){
                        arr[j+1]=arr[j];
                        j--;
                    }
                    arr[i]=ele;
                    needNeg=true;
                }
            }
        }
    }
}
