class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        boolean[] alp = new boolean[256];
        
        int start = 0;
        int end = 0;
        int result = 0;
        int sum = 0;
        
        if(s.length()==0) return 0;
        
        for(start=0;start<s.length();start++){
            if(!alp[s.charAt(start)]){
                alp[s.charAt(start)] = true;
                sum++;
                result = Math.max(sum, result);
            }else{
                while(s.charAt(start)!=s.charAt(end++)){
                    alp[s.charAt(end-1)] = false;
                    sum--;
                }
            }
        }
        
        return result;
    }
}