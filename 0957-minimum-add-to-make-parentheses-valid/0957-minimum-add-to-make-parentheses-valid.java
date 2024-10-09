class Solution {
    public int minAddToMakeValid(String s) {

        int count = 0;

        Stack<Character> stack1 = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){

            char temp = s.charAt(i);
            if(temp == '('){
                stack1.push(temp);
            }else{
                
                if(!stack1.isEmpty()){

                    if(stack1.peek() == '('){
                        stack1.pop();
                    }else{
                        count++;
                    }

                }else{
                    stack1.push(temp);
                }
                
            }

        }

        count = count + stack1.size();

        return count;
        
    }
}