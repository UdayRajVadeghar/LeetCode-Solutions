class Pair{
    int element;
    int index;

    Pair(int element , int index){
        this.element = element;
        this.index = index;
    }
    
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Pair> stack1 = new Stack<>(); 
        int n = temperatures.length-1; 
        
        for(int i = n ; i >= 0 ; i--){

            if(stack1.isEmpty()){
                stack1.push(new Pair(temperatures[i] , i));
                temperatures[i] = 0;
            }else{
                boolean flag = false;
                int element = temperatures[i];
                int count = 0;
                while(!stack1.isEmpty()){

                    Pair temp = stack1.peek();
                   

                    if(temp.element > temperatures[i]){
                        stack1.push(new Pair(temperatures[i] , i));
                        temperatures[i] = temp.index - i;
                        flag = true;
                        break;
                    }else{
                        stack1.pop();
                        System.out.print(temp + " ");
                        count++;
                    }

                }
                System.out.println();

                
                if(!flag){
                    stack1.push(new Pair(temperatures[i] , i));
                    temperatures[i] = 0;
                    
                }

            }

        }
        return temperatures;

        
        
    }
}