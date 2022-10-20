#include <iostream>
using namespace std;

void swapAlternateElements(int arr[], int n){
    int first = 0;
    int second = 1;

    while(second<=n){
        swap(arr[first], arr[second]);
        first = first + 2;
        second = second + 2;
    }
}

void printArray(int arr[], int n){

    for(int i=0; i<n; i++){
        cout << arr[i] <<" ";
    }
    cout<<endl;
}

int main()
{
    int arr[6] = {1, 2, 3, 4, 5, 6};
    

    swapAlternateElements(arr, 6);


    printArray(arr, 6);
    
    return 0;
}
