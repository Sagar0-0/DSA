class Solution{
public:
	// #define ll long long

	ll countSubarray(int arr[], int n, int k) {
	       // code here

     ll ans = (ll)n*(n+1)/2;

        ll l =0;

        for(int i=0;i<n;i++) {

            if(arr[i]<=k) {

                l++;

            } else {

                ans-=(l*(l+1)/2);

                l=0;

            }

        }

        ans-=(l*(l+1)/2);

        return ans;
	}
};
