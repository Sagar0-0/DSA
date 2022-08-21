class CustomStack {
public:
    
    // 1.
//     stack<int> st;
//     int n;
//     CustomStack(int maxSize){
//         n = maxSize;
//     }
    
//     void push(int x){
//         if(st.size() < n){
//             st.push(x);
//         }
//     }
    
//     int pop(){
//         int t = -1;
//         if(!st.empty()){
//             t = st.top();
//             st.pop();   
//         }
//         return t;
//     }
    
//     void increment(int k, int val){
//         stack<int> ts;
//         int m;
//         if(k < st.size()){
//             m = st.size() - k;
//             for(int i=0;i<m;i++){
//                 ts.push(st.top());
//                 st.pop();
//             }
//         }
//         m = st.size();
//         for(int i=0;i<m;i++){
//             ts.push(st.top() + val);
//             st.pop();
//         }
//         m = ts.size();
//         for(int i=0;i<m;i++){
//             st.push(ts.top());
//             ts.pop();
//         }
//     }

    
    
    
    // 2. 
//     Explanation
// Use an additional array to record the increment value.
// inc[i] means for all elements stack[0] ~ stack[i],
// we should plus inc[i] when popped from the stack.
// Then inc[i-1]+=inc[i],
// so that we can accumulate the increment inc[i]
// for the bottom elements and the following pops.


//     Complexity
// C++/Python, initialization is O(1) time & space.
// Java, initialization is O(N) time & space.
// (We cam use ArrayList, but shrug)
// push, pop, increment, all O(1) time and space.
    
    vector<int> stack, inc;
    int n;
    CustomStack(int maxSize) {
        n = maxSize;
    }

    void push(int x) {
        if (stack.size() == n) return;
        stack.push_back(x);
        inc.push_back(0);
    }

    // jo bhi ho raha hain pop function m ho raha hain
    int pop() {
        int i = stack.size() - 1;
        if (i < 0) return -1; // if stack is empty
        if (i > 0) inc[i - 1] += inc[i]; // here if we have added more to current then increment to the previous values too.
        // like in case of 5, 100 and again 2, 100
        // do dry run you will understand better.
        int res = stack[i] + inc[i];
        stack.pop_back();
        inc.pop_back();
        return res;
    }

    void increment(int k, int val) {
        int i = min(k, (int)stack.size()) - 1;
        if (i >= 0) inc[i] += val; // here comes the use of increment vector
    }        
};
