class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list1 = new ArrayList<>(); 

        int i = 0;
        

        while(i < intervals.length){
            int j = i+1;
            int compare = intervals[i][1];  
           

            while( j < intervals.length && compare >= intervals[j][0]){

                compare = Math.max(intervals[j][1] , compare);
                j++; 
            
            }
            List<Integer> list2 = new ArrayList<>();
            list2.add(intervals[i][0]);
            list2.add(compare);
            list1.add(new ArrayList<>(list2));
            i = j;       
        }
        int[][] arr = new int[list1.size()][2];
     

        for(int j = 0 ; j < list1.size() ;j++){

            arr[j][0] = list1.get(j).get(0);
            arr[j][1] = list1.get(j).get(1);

        }

        return arr;
    }
}