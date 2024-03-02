class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        
        for(int i=len-1;i>=0;i--){
            if(++digits[i] != 10) return digits;
            
            digits[i] = 0;
        }
        
        int[] answer = new int[len+1];
        answer[0] = 1;
        
        return answer;
    }
}