class Solution {
    public int dayOfYear(String date) {

        int[] NonLeapYear = {31 , 59 , 90 , 120 , 151 , 181 , 212 , 243 , 273 ,304 , 334 , 365 };
        int[] LeapYear = {31 , 60 , 91 , 121 , 152 , 182 , 213 , 244 , 274 ,305 , 335 , 366 };



        int day = Integer.parseInt(date.substring(8, 10));



        int month = Integer.parseInt(date.substring(5,7));

        int year = Integer.parseInt(date.substring(0 , 4));

        int days = 0;

        if(month == 1){
            return day;
        }

        if((year%4 == 0 && year%100 !=0) || year%400 == 0){
            return (day + LeapYear[month - 2]);
            
        }

        return (day + NonLeapYear[month-2]);
        
    }
}