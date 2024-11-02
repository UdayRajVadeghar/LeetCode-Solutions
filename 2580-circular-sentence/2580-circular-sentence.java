class Solution {
    public boolean isCircularSentence(String sentence) {

        String[] arr = sentence.split(" ");

        if(!(arr[0].charAt(0) == arr[arr.length-1].charAt(arr[arr.length-1].length()-1))){

            return false;
        }

        boolean flag = true;

        for(int i = 1 ; i < arr.length ; i++){

            char temp = arr[i-1].charAt(arr[i-1].length()-1);
            char temp1 = arr[i].charAt(0);

            if(temp != temp1){
                flag = false;
                break;
            }

        }

        return flag;
        
    }
}