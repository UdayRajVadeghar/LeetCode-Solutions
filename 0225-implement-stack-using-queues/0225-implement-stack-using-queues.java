  class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
    
    public void push(int x){
        q.offer(x);
        for(int i = 0 ; i < q.size() - 1 ; i++){
            q.offer(q.poll());
        }
    }
    public int pop(){
        
        return q.poll();
    }

    public int top(){
        return q.peek();
        
    }

    public boolean empty(){
        return q.isEmpty();
    }
   

  }