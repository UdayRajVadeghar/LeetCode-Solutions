class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for(int i = 0 ; i < s.length() ; i++){
            char temp = s.charAt(i);
            

            if(temp == '(' || temp == '{' || temp == '['){
                stack.push(temp);
            }else if(temp == ')'){
                if( stack.isEmpty() || stack.peek() != '('){
                    return false;
                }
                stack.pop();
            }else if(temp == '}'){
                if(stack.isEmpty() || stack.peek() != '{'  ){
                    return false;
                }
                stack.pop();
            }else if(temp == ']' ){
                if(stack.isEmpty() || stack.peek() != '['){
                    return false;
                }
                stack.pop();
            }


        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
        
    }
}