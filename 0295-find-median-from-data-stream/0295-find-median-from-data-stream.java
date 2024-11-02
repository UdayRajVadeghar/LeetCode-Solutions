
//TLE sorting
// class MedianFinder {

//     List<Integer> list1 = new ArrayList<>();

//     public MedianFinder() {
        
//     }
    
//     public void addNum(int num) {

//         list1.add(num);
        
//     }
    
//     public double findMedian() {
//         //TLE Sorting
//         // Collections.sort(list1);
//         // int mid = list1.size()/2;
//         // if(list1.size()%2 == 1){
//         //     return list1.get(mid);
//         // }
//         // double median = (double)(list1.get(mid) + list1.get(mid-1))/2;

//         // return median;
//     }
// }



class MedianFinder {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public MedianFinder() {


        
    }   
    
    public void addNum(int num) {

        //step 1 : inserting the number in the maxHeap which is in this case the minimum-keeper

        maxHeap.offer(num);

        //step 2 : Checking if the size difference is not greater than 1

        if(maxHeap.size()-minHeap.size() > 1){

            minHeap.offer(maxHeap.poll());

        } 

        
        //step 3 : Checking if the top of maxHeap is less than the top of minHeap

        if(!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()){

            minHeap.offer(maxHeap.poll());

        }

        if(minHeap.size() - maxHeap.size() > 1){

            maxHeap.offer(minHeap.poll());

        }

        
    }
    
    public double findMedian() {
        
        int totalSize = maxHeap.size() + minHeap.size();

        if(totalSize%2 == 0){
            int temp1 = maxHeap.peek();
            int temp2 = minHeap.peek();

            return (double)(temp1+temp2)/2;
        }

        if(maxHeap.size() > minHeap.size()){
            return (double)maxHeap.peek();
        }else{
            return (double)minHeap.peek();
        }
        

    }
}


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */