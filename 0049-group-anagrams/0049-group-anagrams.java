class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ana = new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            
            String key = new String(ch);
            
            map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        
        ana.addAll(map.values());
        
        return ana;
    }
}