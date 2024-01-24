class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int count = nums.length/2;
        int answer = 0;
        
        for(int key : nums){
            if(map.get(key)>count) answer = key;
        }
        
        return answer;
    }
}