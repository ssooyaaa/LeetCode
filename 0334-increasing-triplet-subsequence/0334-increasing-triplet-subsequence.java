class Solution {
    public boolean increasingTriplet(int[] nums) {
     
        int start = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(start>=nums[i])
                start = nums[i];
            else if(mid>=nums[i])
                mid = nums[i];
            else
                return true;
        }
        
        return false;
    }
}