#include<iostream>
using namespace std;

int getLength(char ayu[]){
    int count=0;
    for (int i=0; ayu[i]!='\0';i++){
        count++;
    }
    return count;
}

void reverse(char ayu[], int n){
    int s=0;
    int e=n-1;
    while(s<e)
    swap(ayu[s++], ayu[e--]);
}

int main(){
    char ayu[20];
    cout<<"Enter your name: "<<endl;
    cin>>ayu;
    
    cout<<"My name is "<<ayu;
    int len = getLength(ayu);
    cout<<" Length: "<<getLength(ayu)<<endl;
    reverse(ayu, len);
    cout<<"My name is "<<ayu;
}
