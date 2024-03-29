class Solution {
    
    int[] dx = {0,0,-1,1};
    int[] dy = {1,-1,0,0};
    
    public boolean exist(char[][] board, String word) {
        
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)) // 시작점 찾기
                    if(dfs(board, word, 0, visited, i, j)) return true;
            }
        }
        
        return false;
    }
    
    public boolean dfs(char[][] board, String word, int idx, boolean[][] visited, int x, int y){
        
        if(idx == word.length()) return true; // 단어의 끝에 도달했을 때
        
        if(x<0 || y<0 || x>=board.length || y>=board[0].length || visited[x][y] || board[x][y]!=word.charAt(idx)) return false; // 범위를 벗어나거나 이미 방문한 곳이거나 현재 위치의 문자가 단어와 다른 경우
        
        visited[x][y] = true;
        
        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            
            if(dfs(board, word, idx+1, visited, nx, ny)) return true; // DFS를 재귀 호출하여 결과가 true인 경우 반환
            
        }
        
        visited[x][y] = false; // DFS가 실패한 경우 다시 방문하지 않도록 설정
        
        return false;
    }
}