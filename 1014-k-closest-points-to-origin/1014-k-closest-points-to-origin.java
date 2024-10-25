import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {

    double val;
    int[] position;

    Pair(double val, int[] position) {
        this.val = val;
        this.position = position;
    }

    @Override
    public int compareTo(Pair that) {
        return Double.compare(this.val, that.val);
    }
}

class Solution {

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> Double.compare(b.val, a.val));

        for (int i = 0; i < points.length; i++) {

            double x = Math.pow(points[i][0], 2);
            double y = Math.pow(points[i][1], 2);
            double distance = Math.sqrt(x + y);

            queue.offer(new Pair(distance, points[i]));

            
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[][] arr = new int[k][2];
        int count = 0;

        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            arr[count][0] = temp.position[0];
            arr[count][1] = temp.position[1];
            count++;
        }

        return arr;
    }
}
