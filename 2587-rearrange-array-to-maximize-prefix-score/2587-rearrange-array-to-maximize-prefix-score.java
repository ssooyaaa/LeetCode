class Solution {
    public int maxScore(int[] nums) {
     
        long max = 0;
        
        nums = Arrays.stream(nums)
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        for(int i=0;i<nums.length;i++){
            max += nums[i];
            
            if(max<=0) return i;
        }
        
        return nums.length;
    }
}