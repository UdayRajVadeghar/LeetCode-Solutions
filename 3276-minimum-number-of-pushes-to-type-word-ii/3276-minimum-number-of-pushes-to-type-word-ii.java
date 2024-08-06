class Solution {
    public int minimumPushes(String word) {

        //8 total numbers adjustable

        int[] arr = new int[26];


        for(int i =  0 ; i < word.length() ; i++){
            
            char temp = word.charAt(i);

            arr[temp - 'a']++;
            

        }
    

        Queue<Integer> queue1 = new PriorityQueue(Collections.reverseOrder());

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                //System.out.println(arr[i]);
                queue1.offer(arr[i]);

            }
        }

        int count = 0;
        int sum = 0;

        while(!queue1.isEmpty()){

            
            count++;
            for(int i = 0 ; i < 8 ; i++){

                if(queue1.isEmpty()){
                    break;
                }
                sum = sum + queue1.poll()*count;
                System.out.println(sum);
            }
            //System.out.println(sum);

        }

        return sum;

        
        
    }
}