class Solution {
    
    List<List<Integer>> answer = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        
        check(nums, new boolean[nums.length], new ArrayList<>());
        
        return answer;
    }
    
    public void check(int[] nums, boolean[] visited, List<Integer> list){
        
        if(list.size()==nums.length){
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            visited[i] = true;
            list.add(nums[i]);
            check(nums, visited, list);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }
}