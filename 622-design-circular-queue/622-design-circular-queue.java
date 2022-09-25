class MyCircularQueue {

    int[] queue;
    int size;
    int used;
    int front;
    int rear;
    
    public MyCircularQueue(int k) {
        queue = new int[k];
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        queue[rear] = value;
        rear = (rear+1)%size;
        used++;
        return true;
    }
    
    public boolean deQueue()
    {
        if(isEmpty())
            return false;
        front = (front+1)%size;
        used -- ;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        return queue[(rear-1+size)%size];
    }
    
    public boolean isEmpty() {
        return used ==0;
    }
    
    public boolean isFull() {
        return used == size;
    }
}