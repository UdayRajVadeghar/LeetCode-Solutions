class Solution {

    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) {

        String ans = "";

        for(int i = 0 ; i < strs.length ; i++){

            int divident = num/values[i];

            if(divident > 0){

                for(int j = 0 ; j < divident ; j++){

                    ans += strs[i];

                }
                num = num%values[i];

            }

        }

        return ans;

        
    }
}