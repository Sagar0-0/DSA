class Solution {
    static String arr[] = new String[100001];

static int ans[] = new int[100001];

public void build() {
    for(int i=1; i<=100000; i++) {
        arr[i] = Integer.toBinaryString(i);
    }
}

int mod = 1000000007;

public int getVal(int n) {
    int val = 0;
    for(int i=1; i<=n; i++) {
        for(int j=0; j<arr[i].length(); j++) {
            int x = arr[i].charAt(j)-'0';
            val = (val*2 + x)%mod;
        }
        ans[i] = val;
    }
    return val;
}

public int concatenatedBinary(int n) {
    if(arr[1]==null) {
        build();
        getVal(100000);
    }
    return ans[n];
}
}