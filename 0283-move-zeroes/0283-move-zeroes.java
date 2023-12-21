class Solution {
    public void moveZeroes(int[] nums) {
        
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count++;
            else if(count>0){
                int temp = nums[i];
                nums[i] = nums[i-count];
                nums[i-count] = temp;
            }
        }
    }
}