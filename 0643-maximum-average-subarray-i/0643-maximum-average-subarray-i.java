class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double max = Integer.MIN_VALUE;
        double avg = 0;
        double sum = 0;
        
        for(int i=0;i<nums.length;i++){
            
            sum += nums[i];
            
            if(i>=k-1){
                avg = sum/k;
                max = Math.max(avg, max);
                sum -= nums[i-(k-1)];
            }
        }
        
        return max;
    }
}