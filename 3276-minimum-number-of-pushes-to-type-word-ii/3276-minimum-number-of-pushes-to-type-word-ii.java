class Solution {
    public int minimumPushes(String word) {
        
        int[] arr = new int[26];

        for(int i = 0 ; i < word.length() ; i++){

            char temp = word.charAt(i);

            arr[temp - 'a']++;


        }

        int sum = 0;

        Arrays.sort(arr);
        int count = 1;
        int times = 0;

        for(int i = 25 ; i >= 0 ; i--){
            if(times == 8){
                count++;
                times = 0;
            }
            sum = sum + count*arr[i];
            times++;
        }

        return sum;
        
    }
}