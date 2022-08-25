// Find Second Smallest and Second Largest Element in an array without sorting

#include <bits/stdc++.h>
using namespace std;
int main()
{
    int arr[6] = {1, 2, 4, 7, 7, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int small = INT_MAX, second_small = INT_MAX, large = INT_MIN, second_large = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < small) // if any number is still smaller than the current smaller then update second smaller and small number
        {
            second_small = small;
            small = arr[i];            
        }
        else if (arr[i] < second_small and arr[i] != small)
            second_small = arr[i];
        if (arr[i] > large)
        {
            second_large = large; // if any number is still larger thab the current largest then update the second largest and large number
            large = arr[i];            
        }
        else if (arr[i] > second_large and arr[i] != large)
            second_large = arr[i];
    }
    cout << small << " " << large << '\n';
    cout << second_small << " " << second_large << '\n';
}
