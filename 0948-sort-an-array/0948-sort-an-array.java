class Solution {
    public int[] sortArray(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        mergeSort(nums, low, high);

        return nums;
    }

    public static void mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        List<Integer> list1 = new ArrayList<>();
        int leftIndex = low;
        int rightIndex = mid+1;
        
        while(leftIndex <= mid && rightIndex <= high){

            if(nums[leftIndex] < nums[rightIndex]){
                list1.add(nums[leftIndex]);
                leftIndex++;
            }else{
                list1.add(nums[rightIndex]);
                rightIndex++;
            }

        }

        while(leftIndex <= mid){
            list1.add(nums[leftIndex]);
            leftIndex++;
        }
        while(rightIndex <= high){
            list1.add(nums[rightIndex]);
            rightIndex++;
        }
        int j = 0;

        for(int i = low ; i <= high ; i++){
            nums[i] = list1.get(j);
            j++;
        }
        return;
        

        
    }

}