	void rearrange(int arr[], int n) {
    // code here
    vector <int> A;
    vector <int> B;
    for (int i=0; i<n; i++){
        if (arr[i] < 0){
            A.push_back(arr[i]);
        }else{
            B.push_back(arr[i]);
        }
    }
    int i=0;
    int j=0;
    int k=0;
    
    while(i<A.size() && j<B.size()){
        if(k%2 == 0){
            arr[k++] = B[j++];
        }else{
            arr[k++] = A[i++];
        }
    }while(i<A.size()){
        arr[k++] = A[i++];
    }while(j<B.size()){
        arr[k++] = B[j++];
    }
}
