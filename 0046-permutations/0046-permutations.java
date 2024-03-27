class Solution {
    List<List<Integer>> answer = new ArrayList<>();
        
    public List<List<Integer>> permute(int[] nums) {
        
        boolean[] visited= new boolean[nums.length];
        
        permutation(nums, visited, new ArrayList<>());
        
        return answer;
    }
    
    public void permutation(int[] nums, boolean[] visited, List<Integer> list){
        
        if(list.size()==nums.length){
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i] = true;
                list.add(nums[i]);
                permutation(nums, visited, list);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }
}