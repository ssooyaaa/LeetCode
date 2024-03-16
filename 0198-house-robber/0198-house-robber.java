class Solution {
    public int rob(int[] nums) {
     
        int len = nums.length;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0], nums[1]);
        
        int[] arr = new int[len];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);
        
        for(int i=2;i<len;i++){
            arr[i] = Math.max(nums[i]+arr[i-2], arr[i-1]);
        }
        
        return arr[len-1];
    }
}