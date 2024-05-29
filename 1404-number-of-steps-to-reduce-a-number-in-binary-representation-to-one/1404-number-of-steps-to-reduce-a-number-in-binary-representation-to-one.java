class Solution {
    public int numSteps(String s) {
        
        boolean check = false;
        
        int count = 0;
        
        for(int i=s.length()-1;i>0;i--){
            char c = s.charAt(i);
            
            if(check){
                if(c=='0'){
                    c = '1';
                    check = false;
                }else
                    c = '0';
            }
            
            if(c=='1'){
                count++;
                check = true;
            }
            
            count++;
        }
        
        if(check) count++;
        
        return count;
    }
}