class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        List<String> answer = new ArrayList<>();
        
        dfs(s, 0, new ArrayList<>(), answer);
        
        return answer;
    }
    
    public void dfs(String s, int start, List<String> list, List<String> answer){
        
        if(list.size()==4 && start==s.length()){
            answer.add(String.join(".", list));
            return;
        }
        
        if(list.size()==4 || start==s.length()) return;
        
        for(int i=1;i<4;i++){
            if(start+i>s.length()) return;
            
            if(i>1 && s.charAt(start)=='0') return;
            
            String number = s.substring(start, start+i);
            if(Integer.parseInt(number)>255) return;
            
            list.add(number);
            
            dfs(s, start+i, list, answer);
            
            list.remove(list.size()-1);
        }
    }
}