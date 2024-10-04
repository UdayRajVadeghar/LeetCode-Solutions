class Solution {
    public long dividePlayers(int[] skill) {

        Arrays.sort(skill);
        int size = -1;

        int low = 0 ;
        int high = skill.length-1;
        long product = 0;

        while(low <= high){

            if(size == -1){

                size = skill[low] + skill[high];
                product = skill[low]*skill[high];

            }else{
                if(size != skill[low] + skill[high]){
                    return -1;
                }
                product += skill[low]*skill[high];
            }
            low++;
            high--;

        }
        return product;

    }
}
