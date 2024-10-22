class Pair implements Comparable<Pair>{

    int num;
    int index;

    Pair(int num , int index){

        this.num = num;
        this.index = index;

    }
    public int compareTo(Pair that){
        
        return this.num - that.num;
    }

}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int i = 0;
        int j = 0;
        int index = 0;
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        PriorityQueue<Pair> queue1 = new PriorityQueue<>(Collections.reverseOrder());

        while( j < n){

            if(j-i+1 < k){
                queue1.offer(new Pair(nums[j] , j));
                j++;
            }else{
                
                queue1.offer(new Pair(nums[j] , j));

                while(true){
                    Pair temp = queue1.peek();

                    if(temp.index >= i && temp.index <= j){
                        arr[index] = temp.num;
                        index++;
                        break;
                    }else{
                        queue1.poll();
                    }
                }
                i++;
                j++;

            }

        }

        return arr;

    }
}