class Solution {
    public int sumSubarrayMins(int[] arr) {

        int mod = (int)Math.pow(10,9) + 7;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        PSE(arr , stack1 , list1);
        NSE(arr , stack2 , list2);

        //formula = cur - prev x next - curr
        long sum = 0;

        for(int i = 0 ; i < arr.length ; i++){

           long contribution = (long) arr[i] * (i - list1.get(i)) * (list2.get(i) - i) % mod;
            sum = (sum + contribution) % mod;

        }



        return (int)sum;
    }
    public static void PSE(int[] arr , Stack<Integer> stack1 , List<Integer> list1){

        for(int i = 0 ; i < arr.length ; i++){
            while(!stack1.isEmpty() && arr[i] <= arr[stack1.peek()]){
                stack1.pop();
            }
            int prevSmallerElement = stack1.isEmpty()?-1:stack1.peek();
            stack1.push(i);
            list1.add(prevSmallerElement);
        }

    }
    public static void NSE(int[] arr , Stack<Integer> stack2 , List<Integer> list2){

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            while(!stack2.isEmpty() && arr[i] < arr[stack2.peek()]){
                stack2.pop();
            }
            int nextSmallerElement = stack2.isEmpty() ? arr.length : stack2.peek();
            stack2.push(i);
            list2.add(0 , nextSmallerElement);
        }

    }
}