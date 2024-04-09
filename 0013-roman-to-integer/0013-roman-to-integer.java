class Solution {
    public int romanToInt(String s) {
        
        Map<String, Integer> map = new HashMap<>();
        
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        
        int answer = 0;
        
        for(int i=0;i<s.length();){
            String two = s.substring(i, Math.min(s.length(), i+2));
            String one = s.substring(i, i+1);
            
            if(map.containsKey(two)){
                answer += map.get(two);
                i += 2;
            }else{
                answer += map.get(one);
                i++;
            }
        }
        
        return answer;
    }
}