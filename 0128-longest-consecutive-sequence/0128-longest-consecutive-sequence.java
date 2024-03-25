class Solution {
        
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
    
        if(nums.length==0) return 0;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                if(check(nums[i]-1, map)) map.put(nums[i], map.get(nums[i]-1)+1);
                else map.put(nums[i], 1);
            }else {
                if(check(nums[i]-1, map)) map.put(nums[i], map.get(nums[i]-1)+1);
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            if(max<map.get(key)) max = map.get(key);
        }
        
        return max;
    }
    
    public boolean check(int key, Map<Integer, Integer> map){
        if(map.containsKey(key)) return true;
        else return false;
    }
}