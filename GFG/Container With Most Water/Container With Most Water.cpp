long long maxArea(long long A[], int len)
{
    // Your code goes here
    int i = 0;
    int j = len-1;
    
    long long maxArea = 0;
    
    long long base,height, currArea;
    while(i < j)
    {
        base = j-i;
        height = min(A[i], A[j]);
        currArea = base*height;
        
        maxArea = max(maxArea, currArea);
        
        if(A[i] <= A[j]) i++;
        else j--;
    }
    
    return maxArea;
}
