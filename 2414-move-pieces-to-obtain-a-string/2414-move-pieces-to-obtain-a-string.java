class Solution {
    public boolean canChange(String start, String target) {

       
        int j = 0;
        int index = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0 ; i < start.length() ; i++){

            char startChar = start.charAt(i);
            index++;
            if(startChar == '_'){
                continue;
            }else{
                count1++;
            
                while(j < target.length()){

                    char targetChar = target.charAt(j);

                    if(targetChar == '_'){
                        j++;
                        continue;
                    }
                    count2++;
                    if(targetChar != startChar){
                        return false;
                    }

                    if(startChar == 'R'){

                        if(i > j){
                            return false;
                        }

                    }

                    if(startChar == 'L'){
                        
                        if(i < j){
                            return false;
                        }

                    }

                    j++;
                    break;

                }


            }


        }

        while(j < target.length()){
            if(target.charAt(j) == '_'){
                j++;
            }else{
                break;
            }
        }

        if(count1 != count2 || index != j){
            System.out.println(index + " " + j);
            return false;
        }

        

        return true;
        
    }
}