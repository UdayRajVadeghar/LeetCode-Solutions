class MyCalendarTwo {

    private List<int[]> bookings;
    private List<int[]> overlaps;
    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for (int[] overlap : overlaps) {
            if (Math.max(overlap[0], start) < Math.min(overlap[1], end)) {
                return false; 
            }
        }
        
        
        for (int[] booking : bookings) {
            if (Math.max(booking[0], start) < Math.min(booking[1], end)) {
                
                overlaps.add(new int[] {Math.max(booking[0], start), Math.min(booking[1], end)});
            }
        }
        
        
        bookings.add(new int[] {start, end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */