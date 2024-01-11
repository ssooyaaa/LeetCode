class Solution {
    
    int[] dx = {0,0,-1,1};
    int[] dy = {1,-1,0,0};
    boolean[][] visited;
    int exit;
    
    public int nearestExit(char[][] maze, int[] entrance) {
        
        int m = maze.length;
        int n = maze[0].length;
        
        visited = new boolean[m][n];
        visited[entrance[0]][entrance[1]] = true;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{entrance[0], entrance[1], 0});  // 거리 정보 추가
        
        while(!q.isEmpty()){
            int size = q.size();

            for(int s = 0; s < size; s++){
                int[] now = q.poll();
                int x = now[0];
                int y = now[1];
                int distance = now[2];

                for(int j = 0; j < 4; j++){
                    int nX = x + dx[j];
                    int nY = y + dy[j];
                    
                    if(nX >= 0 && nY >= 0 && nX < m && nY < n && !visited[nX][nY] && maze[nX][nY] == '.'){
                        
                        if(nX == 0 || nY == 0 || nX == m - 1 || nY == n - 1)
                            return distance + 1;  // 현재 노드도 포함하여 거리 반환
                        
                        visited[nX][nY] = true;
                        q.add(new int[]{nX, nY, distance + 1});
                    }
                }
            }
        }
        
        return -1;
    }
}