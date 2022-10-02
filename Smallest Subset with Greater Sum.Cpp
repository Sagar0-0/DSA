int minSubset(vector<int> &Arr,int N){
        sort(Arr.begin(),Arr.end());
        long long int sum=0;
        for(int i=0;i<N;i++)
        sum+=Arr[i];
        long long int x=0;
        int count=1;
        for(int j=N-1;j>=1;j--)
        {
            x+=Arr[j];
            if(x>sum-x)
            break;
            count++;
        }
        return count;
    }
