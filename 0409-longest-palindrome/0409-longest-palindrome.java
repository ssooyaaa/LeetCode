class Solution {
    public int longestPalindrome(String s) {
        
        int[] arr = new int[128];
        
        for(char c : s.toCharArray()) arr[c]++;
        
        int len = 0;
        boolean odd = false;
        
        for(int count : arr){
            len += count/2*2;
            
            if(count%2==1) odd = true;
        }
        
        return odd? len+1:len;
    }
}