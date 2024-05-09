class Solution {
    public int jump(int[] nums) {
         
        int count = 0;
        int max = 0;
        int pos = 0;
        
        for(int i=0;i<nums.length-1;i++){
            max = Math.max(max, i+nums[i]);
            
            if(i==pos){
                pos = max;
                count++;
            }
        }
        
        return count;
    }
}