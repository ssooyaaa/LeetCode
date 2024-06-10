class Solution {
    public int heightChecker(int[] heights) {
        
        int answer = 0;
        int now = 1;
        int[] count = new int[101];
        
        for(int height:heights)
            count[height]++;
        
        for(int height:heights){
            while(count[now]==0)
                now++;
            
            if(height != now) answer++;
            
            count[now]--;
        }
        
        return answer;
    }
}