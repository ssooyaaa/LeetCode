class Solution {
    public int maximalSquare(char[][] matrix) {
     
        int m = matrix.length;
        int n = matrix[0].length;
        
        int max = 0;
        
        int[][] dp = new int[m][n];
        
        int[] dx = {0,-1,-1};
        int[] dy = {-1,0,-1};
        
        for(int i=0;i<m;i++){
            dp[i][0] = matrix[i][0]-'0';
            max = Math.max(dp[i][0], max);
        }
        
        for(int i=0;i<n;i++){
            dp[0][i] = matrix[0][i]-'0';
            max = Math.max(dp[0][i], max);
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                
                if(matrix[i][j]=='1'){
                    int value = m+n;
                    
                    for(int k=0;k<3;k++){
                        int nx = i+dx[k];
                        int ny = j+dy[k];
                        value = Math.min(value, dp[nx][ny]);
                    }
                    dp[i][j] = value+1;
                }else{
                    dp[i][j]=0;
                }
                
                max = Math.max(max, dp[i][j]);
            }
        }
        
        return max*max;
    }
}