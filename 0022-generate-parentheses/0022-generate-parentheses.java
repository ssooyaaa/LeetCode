class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> answer = new ArrayList<>();
        
        backTracking(answer, "", 0, 0, n);
        
        return answer;
    }
    
    public void backTracking(List<String> answer, String s, int open, int close, int max){
        if(s.length()==max*2){
            answer.add(s);
            return;
        }
        
        if(open<max)
            backTracking(answer, s+"(", open+1, close, max);
        
        if(close<open)
            backTracking(answer, s+")", open, close+1, max);
    }
}