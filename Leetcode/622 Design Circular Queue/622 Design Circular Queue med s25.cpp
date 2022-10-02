#include<bits.stdc++.h>
using namespace std;

class MyCircularQueue {
public:
    MyCircularQueue(int k) {
//        queue holding the elems for circular queue
        q.resize(k);
//         no. of elems in the circular queue
        count =0;
        size =k; // queue size
        headIndex =0; // index of head element
    }
    
    bool enQueue(int value) {
//         handle full case
        if(isFull()) return false;
        q[(headIndex+count)% size] = value;
        count+=1;
        return true;
    }
    
    bool deQueue() {
//         handle empty case
        if(isEmpty()) return false;
//         update head idx
        headIndex= (headIndex+1)% size;
        count-=1;
        return true;
    }
    
    int Front() {
//         handle empty queue case
        if(isEmpty()) return -1;
        return q[headIndex]; // return head elem
    }
    
    int Rear() {
//         handle empty queue case
        if(isEmpty()) return -1;
        return q[(headIndex+count-1) %size];
    }
    
    bool isEmpty() {
//        no elem in queue
        return count == 0;
    }
    
    bool isFull() {
//         return true if the count is equal to the queue size
        return count==size;
//         else return false
    }
    private:
    int count, size, headIndex;
    vector<int> q;
};
