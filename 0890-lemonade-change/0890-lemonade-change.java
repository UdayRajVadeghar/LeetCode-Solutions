class Solution {
    public boolean lemonadeChange(int[] bills) {

        int arr[] = new int[3];

        for(int i = 0 ; i < bills.length ; i++){
            if(bills[i] == 5){
                arr[0] += 1;
            }else if(bills[i]==10){
                arr[1] += 1;
                if(arr[0] == 0){
                    return false;
                }else{
                    arr[0] = arr[0] - 1;
                }
            }else{
                arr[2]++;
                if(arr[0] == 0){
                    return false;
                }else{
                    if(arr[1] != 0){
                        arr[1] = arr[1]- 1;
                        arr[0] = arr[0] - 1;
                    }
                    else{
                        if(arr[0] < 3){
                            return false;
                        }else{
                            arr[0] = arr[0] - 3;
                        }
                    }
                }
            }
        }
        return true;

        
        
    }
}