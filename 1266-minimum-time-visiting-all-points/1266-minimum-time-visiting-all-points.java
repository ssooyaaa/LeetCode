class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int a = 0;
        int b = 0;
        int count = 0;
        
        for(int i=0;i<points.length-1;i++){
            a = Math.abs(points[i+1][0]-points[i][0]);
            b = Math.abs(points[i+1][1]-points[i][1]);
            
            count += Math.max(a,b);
        }
        
        return count;
    }
}