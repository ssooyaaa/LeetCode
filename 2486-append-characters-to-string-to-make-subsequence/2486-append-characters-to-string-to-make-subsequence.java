class Solution {
    public int appendCharacters(String s, String t) {
     
        int idx = 0;
        
        for(char c : s.toCharArray()){
            if(c==t.charAt(idx)){
                if(++idx==t.length()) return 0;
            }
        }
        
        return t.length()-idx;
    }
}