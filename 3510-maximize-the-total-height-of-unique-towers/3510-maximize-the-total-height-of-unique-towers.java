class Solution {
    public long maximumTotalSum(int[] maximumHeight) {

        long sum = 0;

        Arrays.sort(maximumHeight);
        Map<Integer , Integer> map1 = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i = maximumHeight.length - 1 ; i >= 0 ; i--){

            int temp = maximumHeight[i];

            if(temp > min){
                temp = min;
            }
            

            while(temp > 0){
                

                if(!map1.containsKey(temp)){
                    sum = sum + temp;
                    map1.put(temp , 1);
                    min = temp;
                    break;
                }else{

                    temp--;
                }

            }
            if(temp == 0){
                return -1;
            }

        }

        return sum;

        
    }
}