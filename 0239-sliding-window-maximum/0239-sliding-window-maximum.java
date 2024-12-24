class Pair {

    int index;
    int value;

    public Pair(int index, int value) {

        this.index = index;
        this.value = value;

    }

}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] arr = new int[nums.length - k + 1];

        Deque<Pair> queue1 = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {

            while (!queue1.isEmpty()) {

                if (queue1.peekLast().value <= nums[i]) {
                    queue1.removeLast();
                }else{
                    break;
                }

            }
            queue1.addLast(new Pair(i, nums[i]));
        }

        arr[0] = queue1.peekFirst().value;
        int curIndex = 1;

        for (int i = k; i < nums.length; i++) {
            
            while(!queue1.isEmpty() && Math.abs(queue1.peekFirst().index - i) >= k){

                queue1.removeFirst();

            }
            while (!queue1.isEmpty()) {

                if (queue1.peekLast().value <= nums[i]) {
                    queue1.removeLast();
                }else{
                    break;
                }

            }
            queue1.addLast(new Pair(i, nums[i]));
            arr[curIndex] = queue1.peekFirst().value;
            curIndex++;


        }

        return arr;

    }
}