class MyQueue {
    Stack<Integer> s;
    Stack<Integer> r;  

    public MyQueue() {
        s = new Stack<>();
        r = new Stack<>();

              
    }
    
    public void push(int x) {
        s.push(x);
        
    }
    
    public int pop() {
        if(r.isEmpty()){
            while(!s.isEmpty()){
                r.push(s.pop());
            }
        }
        
        return r.pop();
        
        
    }
    
    public int peek() {
         if(r.isEmpty()){
            while(!s.isEmpty()){
                r.push(s.pop());
            }
        }
        
        return r.peek();
        
    }
    
    public boolean empty() {
        if(r.isEmpty()){
            while(!s.isEmpty()){
                r.push(s.pop());
            }
        }
        if(!r.isEmpty()){
            return false;

        }
        return true;

        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */