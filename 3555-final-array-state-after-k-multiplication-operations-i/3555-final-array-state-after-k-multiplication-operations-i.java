class Pair implements Comparable<Pair>{

    int value ;
    int index ;

    public Pair(int value , int index){

        this.value = value;
        this.index = index;

    }

    public int compareTo(Pair that){

        if(this.value != that.value){
            return this.value - that.value;
        }

        return this.index - that.index;
        
    }
   

    

}


class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

            PriorityQueue<Pair> queue1 = new PriorityQueue<>();

        for(int i = 0 ; i < nums.length ; i++){

            queue1.offer(new Pair(nums[i] , i));

        }

        while(k > 0){

            Pair temp = queue1.poll();
            int val = temp.value;
            int index = temp.index;
            
            int newVal = val * multiplier;
            
            queue1.offer(new Pair(newVal , index));
            k--;

        }

        for(int i = 0 ; i < nums.length ; i++){

            Pair temp = queue1.poll();
            int val = temp.value;
            int index = temp.index;

            nums[index] = val;

        }
        return nums;

        
    }
}