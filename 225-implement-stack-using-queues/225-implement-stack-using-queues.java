class MyStack {
    Queue<Integer> q1,q2;
    boolean fis;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        fis=true;
    }
    
    public void push(int x) {
        if(fis){
            q1.add(x);
        }else{
            q2.add(x);
        }
    }
    
    public int pop() {
        if(fis){
            fis=false;
            while(q1.size()>1){
                q2.add(q1.remove());
            }
            int ele=q1.remove();
            return ele;
        }else{
            fis=true;
            while(q2.size()>1){
                q1.add(q2.remove());
            }
            int ele=q2.remove();
            return ele;
        }
    }
    
    public int top() {
        if(fis){
            fis=false;
            while(q1.size()>1){
                q2.add(q1.remove());
            }
            int ele=q1.peek();
            q2.add(q1.remove());
            return ele;
        }else{
            fis=true;
            while(q2.size()>1){
                q1.add(q2.remove());
            }
            int ele=q2.peek();
            q1.add(q2.remove());
            return ele;
        }
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */