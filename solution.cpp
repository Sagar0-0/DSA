//Solution by vikasji

struct node{
   node *next[26]={NULL};
   int c=0; // for counting prefix
};
class trie{
   node *root;
public:
   trie(){
       root=new node;
   }
   void insert(string &s){
       node *head=root;
       for(auto i:s){
           if(!head->next[i-'a']) head->next[i-'a']=new node;
           head=head->next[i-'a'];
           head->c++;
       }
   }
   int prefix(string &s){
       node *head=root;
       for(auto i:s){
           if(!head->next[i-'a']) return 0;
           head=head->next[i-'a'];
       }
       return head->c;
   }
};
class Solution{
public:
   vector<int> prefixCount(int N, int Q, string li[], string query[])
   {
       trie *t=new trie();
       vector<int> ans(Q);
       for(int i=0;i<N;i++) t->insert(li[i]);
       for(int i=0;i<Q;i++) ans[i]=t->prefix(query[i]);
       return ans;
   }
};