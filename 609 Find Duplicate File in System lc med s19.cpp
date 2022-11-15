#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<string> split(string str, char delim) {
        string line;
        vector<string> res;
        stringstream ss(str);
        while (getline(ss, line, delim)) res.push_back(line);
        return res;
    }

    vector<vector<string>> findDuplicate(vector<string>& paths) {
        vector<vector<string>> ans;
        unordered_map<string, vector<string>> m;
        for (auto p : paths) {
            vector<string> path = split(p, ' ');
            string directoryPath;
            for (int i = 0; i < path.size(); i++) {
                if (i == 0) {
                    directoryPath = path[i];
                } else {
                    string fileName = path[i].substr(0, path[i].find('('));
                    string fileContent =  path[i].substr(path[i].find('(') + 1, path[i].find(')') - path[i].find('(') - 1);
                    m[fileContent].push_back(directoryPath + "/" + fileName);
                }
            }
        }
        for (auto x : m) {
            if (x.second.size() > 1) {
                ans.push_back(x.second);    
            }
        }
        return ans;
    }
};