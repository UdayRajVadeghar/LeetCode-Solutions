class Pair implements Comparable<Pair> {

    int number;
    int index;

    public Pair(int number, int index) {
        this.number = number;
        this.index = index;
    }

    @Override
    public int compareTo(Pair that) {
        int numberComparison = Integer.compare(this.number, that.number);
        return (numberComparison != 0) ? numberComparison : Integer.compare(this.index, that.index);
    }
}


class Solution {
    public long findScore(int[] nums) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0 ; i < nums.length ; i++){

            pq.offer(new Pair(nums[i] , i));

        }

        long count = 0;

        while(!pq.isEmpty()){

            Pair temp = pq.poll();
            int num = temp.number;
            int index = temp.index;

            if(!(nums[index] < 0)){

                count = count + num;

                if(index-1 >= 0 && nums[index-1] > 0){
                    nums[index-1] = -1*nums[index-1];
                }
                if(index+1 <= nums.length-1 && nums[index+1] > 0){
                    nums[index+1] = -1 * nums[index+1];
                }
                
            }

        }

        return count;


        
    }
}