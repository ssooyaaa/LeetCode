class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> answer = new ArrayList<>();
        
        Arrays.sort(nums);
       
        for(int i=0;i<nums.length;i++){
            int first = nums[i];
            
            if(i>0 && nums[i-1]==first) continue;
            
            int start = i+1;
            int end = nums.length-1;
            
            while(start<end){
                int sum = first+nums[start]+nums[end];
                
                if(sum<0) ++start;
                else if(sum>0) --end;
                else{
                    answer.add(Arrays.asList(first, nums[start], nums[end]));
                    
                    while(start<end && nums[start]==nums[start+1])
                        ++start;
                    while(start<end && nums[end]==nums[end-1])
                        --end;
                    
                    ++start;
                    --end;
                }
            }
        }
        
        return answer;
    }
}