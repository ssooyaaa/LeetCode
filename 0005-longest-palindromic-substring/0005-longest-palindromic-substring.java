class Solution {
    public String longestPalindrome(String s) {
        
        String answer = "";
        
        if(s.length()==1) return s;
        
        if(s.length()==2)
            return s.charAt(0)==s.charAt(1)? s:s.substring(0,1);
        
        for(int i=0;i<s.length();i++){
            int start = i;
            int end = i;
            
            while(0<=start && end<s.length() && s.charAt(start)==s.charAt(end)){
                start--;
                end++;
            }
            
            if(answer.length()<end-start-1)
                answer = s.substring(start+1, end);
            
            start = i;
            end = i+1;
            
            while(0<=start && end<s.length() && s.charAt(start)==s.charAt(end)){
                start--;
                end++;
            }
            
            if(end-start==1) continue;
            
            if(answer.length()<end-start-1)
                answer = s.substring(start+1, end);
        }
        
        return answer;
    }
}