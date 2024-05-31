class Solution {
    public int[] singleNumber(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] answer = new int[2];
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int idx = 0;
        
        for(int key:map.keySet()){
            if(map.get(key)!=1) continue;
            else{
                answer[idx] = key;
                idx++;
            }
        }
        
        return answer;
    }
}