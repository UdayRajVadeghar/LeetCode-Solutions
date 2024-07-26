class MinStack {

    Stack<Integer> stack1 = new Stack();
    Queue<Integer> queue1 = new PriorityQueue<>();
    Queue<Integer> queue2 = new PriorityQueue<>();


    public MinStack() {
        
    }
    
    public void push(int val) {

        stack1.push(val);
        queue1.offer(val);

    }
    
    public void pop() {
        
        int element = stack1.pop();
        boolean flag = true;
        while(!queue1.isEmpty()){
            
            if(element == queue1.peek() && flag){
                flag = !flag;
                queue1.poll();
                continue;
            }else{
                queue2.offer(queue1.poll());
            }
        }
        Queue<Integer> temp = new PriorityQueue<>();
        queue1 = queue2;
        queue2 = temp;
    

    }
    
    public int top() {
        
        return stack1.peek();

    }
    
    public int getMin() {
        
        return queue1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */