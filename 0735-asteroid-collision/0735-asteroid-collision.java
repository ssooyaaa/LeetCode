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
        
        int[] ans = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }
        
        return ans;
        
    }
}