class Solution {
    
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static int m, n;
    static Queue<int[]> q = new LinkedList<>();
    
    public void solve(char[][] board) {
        
        m = board.length;
        n = board[0].length;
        
        checkRow(board);
        checkCol(board);
        check(board);
        update(board);
    }
    
    public void checkRow(char[][] board){
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                board[0][i] = '*';
                q.add(new int[]{0,i});
            }
            
            if(board[m-1][i]=='O'){
                board[m-1][i]='*';
                q.add(new int[]{m-1,i});
            }
        }
    }
    
    public void checkCol(char[][] board){
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                board[i][0] = '*';
                q.add(new int[]{i,0});
            }
            
            if(board[i][n-1]=='O'){
                board[i][n-1]='*';
                q.add(new int[]{i,n-1});
            }
        }
    }
    
    public void check(char[][] board){
        while(!q.isEmpty()){
            int[] now = q.poll();
            
            for(int i=0;i<4;i++){
                int nx = now[0]+dx[i];
                int ny = now[1]+dy[i];
                
                if(nx>=0 && ny>=0 && nx<m && ny<n && board[nx][ny]=='O'){
                    board[nx][ny] = '*';
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }
    
    public void update(char[][] board){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='*')
                    board[i][j]='O';
            }
        }
    }
}