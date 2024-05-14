class Solution {
    public int addDigits(int num) {
        
        if(num<=9) return num;
        
        int number = num;
        int sum = 0;
        
        while(number>=10){
            while(number>=1){
                sum += number%10;
                number/=10;
            }
            
            if(sum>=10){
                number = sum;
                sum = 0;
            }
        }
        
        return sum;
    }
}