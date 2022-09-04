// Solution of leetcode problem in cpp.
// Used bfs approach for this solution

#include<bits/stdc++.h>

using namespace std;

int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
    queue<string> q;

    q.push(beginWord);

    int wordSize = beginWord.length();

    unordered_set<string> word;
    for(int i = 0; i < wordList.size(); i++){
        word.insert(wordList[i]);
    }

    if(word.find(endWord) == word.end()) return 0;
    int len = 0;
    while(!q.empty()){
        len++;
        int qsize = q.size();
        for(int i = 0; i < qsize; i++){
            string s = q.front();
            q.pop();

            for(int j = 0; j < wordSize; j++){
                char letter = s[j];
                for(char ch = 'a'; ch <= 'z'; ch++){
                    s[j] = ch;
                    if(s == endWord) return len+1;
                    if(word.find(s) == word.end()) continue;

                    q.push(s);
                    word.erase(s);
                }
                s[j] = letter;
            }
        }
    }
    return 0;
}
