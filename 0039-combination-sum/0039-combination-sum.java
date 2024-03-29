class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        back(ans, new ArrayList<>(), candidates, target, 0);
        
        return ans;
    }
    
    public void back(List<List<Integer>> ans, List<Integer> list, int[] candi, int target, int start){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start;i<candi.length;i++){
            if(candi[i]>target) break;
            
            list.add(candi[i]);
            back(ans, list, candi, target-candi[i], i);
            list.remove(list.size()-1);
        }
    }
}