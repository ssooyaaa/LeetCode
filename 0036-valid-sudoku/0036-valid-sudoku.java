class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            Set<Character> row = new HashSet<>();
            Set<Character> column = new HashSet<>();
            Set<Character> subBox = new HashSet<>();
            
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && row.add(board[i][j])==false) return false;
                
                if(board[j][i]!='.' && column.add(board[j][i])==false) return false;
                
                int rowIdx = 3*(i/3);
                int colIdx = 3*(i%3);
                if(board[rowIdx+j/3][colIdx+j%3]!='.' && subBox.add(board[rowIdx+j/3][colIdx+j%3])==false)
                    return false;
            }
        }
        
        return true;
    }
}