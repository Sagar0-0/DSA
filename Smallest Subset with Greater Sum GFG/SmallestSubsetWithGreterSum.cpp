int minSubset(vector<int> &Arr,int N){
        sort(Arr.begin(),Arr.end());
        int count=0;
        long long sum=0;
        for(int i=0;i<N;i++){
            sum+=Arr[i];
        }
        
        int j=N-1;
        long long rev=0;
        while(j>=0){
            sum-=Arr[j];
            rev+=Arr[j];
            if(rev>sum)
            return N-j;
            else{
                j--;
            }
        }
        return N;
    }