class Solution {
    public int maxSubArray(int[] nums) {
        
        int answer = nums[0];
        int min = 0;
        int now = nums[0];
        
        for(int i=1;i<nums.length;i++){
            min = Math.min(min, now);
            now += nums[i];
            answer = Math.max(answer, now-min);
        }
        
        return answer;
    }
}