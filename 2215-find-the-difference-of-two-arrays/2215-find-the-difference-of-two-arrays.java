class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        Set<Integer> setA = new HashSet<>();
        for(int num:nums1){
            setA.add(num);
        }
        Set<Integer> setB = new HashSet<>();
        for(int num:nums2){
            setB.add(num);
        }
        
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        
        for(int num:setA){
            if(!setB.contains(num))
                listA.add(num);
        }
        
        for(int num:setB){
            if(!setA.contains(num))
                listB.add(num);
        }
        
        answer.add(listA);
        answer.add(listB);
        
        return answer;
        
    }
}