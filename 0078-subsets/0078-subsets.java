class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> answer = new ArrayList<>();
        
        backTracking(nums, 0, new ArrayList<>(), answer);
        
        return answer;
    }
    
    public void backTracking(int[] nums, int idx, List<Integer> arr, List<List<Integer>> answer){
        
        answer.add(new ArrayList<>(arr));
        
        for(int i=idx;i<nums.length;i++){
            arr.add(nums[i]);
            backTracking(nums, i+1, arr, answer);
            arr.remove(arr.size()-1);
        }
    }
}