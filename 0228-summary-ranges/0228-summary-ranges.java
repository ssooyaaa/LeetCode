class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        
        int start = 0;
        for(int i=1;i<nums.length+1;i++){
            if(i==nums.length || nums[i]!=nums[i-1]+1){
                if(i-1==start){
                    list.add(String.valueOf(nums[start]));
                }else{
                    list.add(String.format("%d->%d", nums[start], nums[i-1]));
                }
                
                start = i;
            }
        }
        
        return list;
    }
}