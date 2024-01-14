class Solution {
    public int equalPairs(int[][] grid) {
        
        int count = 0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(isEqualRC(grid, i, j)) count++;
            }
        }
        
        return count;
    }
    
    public boolean isEqualRC(int[][] grid, int row, int col){
        
        for(int i=0;i<grid.length;i++){
            if(grid[row][i] != grid[i][col]) return false;
        }
        
        return true;
    }
}