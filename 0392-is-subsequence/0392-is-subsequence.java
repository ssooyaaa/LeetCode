class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int idx = 0;
        for(int i=0;i<t.length() && idx<s.length();i++){
            if(s.charAt(idx)==t.charAt(i)) idx++;
        }
        
        return idx==s.length();
    }
}