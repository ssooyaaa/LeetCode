class Solution {
    
    static int m, n;
    static boolean[][] visited;
    static int land;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    
    public int numIslands(char[][] grid) {
       
        m = grid.length;
        n = grid[0].length;
        
        visited = new boolean[m][n];
        
        land = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    land++;
                    dfs(i,j,grid);
                }
            }
        }
        
        return land;
    }
    
    public void dfs(int x, int y, char[][] grid){
        
        visited[x][y] = true;
        
        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            
            if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]=='1' &&!visited[nx][ny]){
                visited[nx][ny] = true;
                dfs(nx, ny, grid);
            }
        }
        
    }
}