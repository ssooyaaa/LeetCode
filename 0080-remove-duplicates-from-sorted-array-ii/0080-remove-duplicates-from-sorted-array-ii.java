class Solution {
    public int removeDuplicates(int[] nums) {
        
        int answer = 0;
        
        for(int num:nums){
            if(answer<2 || num>nums[answer-2])
                nums[answer++] = num;
        }
        
        return answer;
    }
}