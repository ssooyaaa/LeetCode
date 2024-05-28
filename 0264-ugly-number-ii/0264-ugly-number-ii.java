import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        while(list.size()<n){
            int prime2 = list.get(a)*2;
            int prime3 = list.get(b)*3;
            int prime5 = list.get(c)*5;
            
            int num = Math.min(Math.min(prime2, prime3), prime5);
            list.add(num);
            
            if(num==prime2) a++;
            if(num==prime3) b++;
            if(num==prime5) c++;
        }
        
        return list.get(n-1);
    }
}