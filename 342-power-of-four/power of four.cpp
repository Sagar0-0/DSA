bool isPowerOfFour(int n) {
        long int ans=0;
        int i=0;
        
        while(ans<=n)
        {
            ans=pow(4,i);
            i++;
            if(ans==n)
                return true;
        }
        return false;
    }
