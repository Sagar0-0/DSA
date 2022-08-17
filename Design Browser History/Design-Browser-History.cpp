#include<bits/stdc++.h>
class BrowserHistory {
public: 
  // // 1. using 2 stacks
//     stack<string> ur, fb;
//     BrowserHistory(string homepage) {
//         ur.push(homepage);
//         fb = stack<string>();
//     }
    
//     void visit(string url) {        
//         ur.push(url);
//         fb = stack<string>();
//     }
    
//     string back(int steps) {
//         while(steps>0 and ur.size() > 1){
//             fb.push(ur.top());
//             ur.pop();
//             steps--;
//         }
//         return ur.top();
//     }
    
//     string forward(int steps) {
//         while(steps>0 and fb.size()>0){
//             ur.push(fb.top());
//             fb.pop();
//             steps--;
//         }
//         return ur.top();
//     }
    
  
  // 2. using array of strings more efficient than 1. 
        string ur[5000];
        int cur=0, end=0;
        
        BrowserHistory(string homepage) {
            ur[0] = homepage;
        }
        
        void visit(string url) {        
            cur++;
            ur[cur] = url;
            end = cur;
        }
        
        string back(int steps) {
            if(steps>cur) cur=0;
            else cur-=steps;
            return ur[cur];
        }
        
        string forward(int steps) {
            if(cur+steps>end) cur=end;
            else cur+=steps;
            return ur[cur];
        }
    
    
};
