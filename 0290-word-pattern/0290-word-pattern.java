class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<String, String> map = new HashMap<>();
        
        String[] p = pattern.split("");
        String[] st = s.split(" ");
        
        if(p.length != st.length) return false;
        
        for(int i=0;i<p.length;i++){
            if(map.containsKey(p[i])){
                if(!map.get(p[i]).equals(st[i]))
                    return false;
            }else{
                if(!map.containsValue(st[i]))
                    map.put(p[i], st[i]);
                else return false;
            }
        }
        
        return true;
    }
}