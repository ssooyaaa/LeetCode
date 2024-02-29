class Solution {
    public void rotate(int[][] matrix) {
     
        int n = matrix.length;
        int rotate = n%2==0? n/2 : n/2+1;
        int count = n-1;
        
        for(int i=0;i<rotate;i++){
            for(int j=0;j<count;j++){
                int temp = matrix[i][j+i];
                
                matrix[i][j+i] = matrix[n-1-j-i][i];
                matrix[n-1-j-i][i] = matrix[n-1-i][n-1-j-i];
                matrix[n-1-i][n-1-j-i] = matrix[j+i][n-1-i];
                matrix[j+i][n-1-i] = temp;
            }
            
            count -= 2;
        }
    }
}