class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1 || numRows>=s.length())
            return s;
        
        StringBuilder[] sb = new StringBuilder[numRows];
        
        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        
        int idx = 0;
        int dir = 1;
        
        for(char c : s.toCharArray()){
            sb[idx].append(c);
            
            if(idx==0) dir = 1;
            else if(idx==numRows-1) dir = -1;
            
            idx += dir;
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(StringBuilder st:sb){
            answer.append(st);
        }
        
        return answer.toString();
    }
}