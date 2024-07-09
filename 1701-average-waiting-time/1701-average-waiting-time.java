class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        double wait = 0;
        double now = 0;
        
        for(int[] customer : customers){
            now = Math.max(now, 1.0*customer[0])+customer[1];
            wait += now-customer[0];
        }
        
        return 1.0*wait/customers.length;
    }
}