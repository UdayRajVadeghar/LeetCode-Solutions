class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack1 = new Stack<>();

        for(int i = prices.length-1 ; i >= 0 ; i--){

            if(stack1.isEmpty()){
                stack1.push(prices[i]);
            }else{
                while(!stack1.isEmpty()){
                    int temp = stack1.peek();

                    if(temp <= prices[i]){
                        stack1.push(prices[i]);
                        prices[i] = prices[i] - temp;
                        
                        break;
                    }else{
                        stack1.pop();
                    }
                }

                if(stack1.isEmpty()){
                    stack1.push(prices[i]);
                }
                
            }

        }

        return prices;

        
    }
}