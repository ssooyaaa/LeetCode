class Solution {
    public String countAndSay(int n) {
        
        StringBuilder answer = new StringBuilder("1");
        
        while(n-->1){
            StringBuilder sb = new StringBuilder();
            
            for(int i=0;i<answer.length();i++){
                int count = 1;
                
                while(i+1<answer.length() && answer.charAt(i)==answer.charAt(i+1)){
                    count++;
                    i++;
                }
                
                sb.append(count).append(answer.charAt(i));
            }
            answer = sb;
        }
        
        return answer.toString();
    }
}