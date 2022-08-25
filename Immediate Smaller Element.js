class Solution {
    immediateSmaller(arr,n){
       //code here
    //    loop iterates to last numbers
       	    for(let i=0; i<n-1; i++){
	        if(arr[i+1]<arr[i]) arr[i]= arr[i+1];
	        else arr[i] = -1;
	    }
	    arr[n-1] = -1;
    }
}