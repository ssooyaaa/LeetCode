class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            
            int ast = asteroids[i];
            
            if(ast>0) st.push(ast);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-ast) st.pop();
                
                if(st.isEmpty() || st.peek()<0) st.push(ast);
                
                else if(st.peek()==-ast) st.pop();
            }
        }
        
        int[] ans = st.stream().mapToInt(Integer::intValue).toArray();
        
        return ans;
        
    }
}