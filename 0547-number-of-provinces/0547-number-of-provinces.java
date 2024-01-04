class Solution {
    
    int provinces;
    int[][] isConnected;
    boolean[] visited;
    
    public int findCircleNum(int[][] isConnected) {
        
        provinces = 0;
        this.isConnected = isConnected;
        visited = new boolean[isConnected.length];
        
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(i);
                provinces++;
            }
        }
        
        return provinces;
    }
    
    public void dfs(int city){
        
        visited[city] = true;
        
        for(int i=0;i<isConnected[0].length;i++){
            if(isConnected[city][i]==1 && !visited[i])
                dfs(i);
        }
    }
}