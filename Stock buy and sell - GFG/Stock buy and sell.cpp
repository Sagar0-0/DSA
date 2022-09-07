// N = 7
// A[] = { 100, 180, 260, 310, 40, 535, 695 }


// This function finds the buy sell schedule for maximum profit
void stockBuySell(int price[], int n) {
    // code here
    vector<vector<int>> v;
    // int profit = 0;
    for(int i=1;i<n;){
        if(price[i] >= price[i-1]){
            int j = i;
            while(j < n and price[j] >= price[j-1]){
                j++;
            }
            // profit = max(profit, (price[j-1] - price[i-1]));
            v.push_back({i-1, j-1});
            i = j;
        }else i++;
    }
    // cout<<profit<<"\n";
    if(v.size() == 0) cout<<"No Profit";
    else{
        for(int i=0;i<v.size();i++){
            cout<<"("<<v[i][0]<<" "<<v[i][1]<<") ";
        }
    }
    cout<<"\n";
}
