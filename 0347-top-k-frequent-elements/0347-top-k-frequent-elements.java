import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] answer = new int[k];
        List<Integer> keyList = new ArrayList<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        for(Integer key:keySet){
            keyList.add(key);
            System.out.print(key);
        }
        
        for(int i=0;i<k;i++){
            answer[i] = keyList.get(i);
        }
        
        return answer;
    }
}