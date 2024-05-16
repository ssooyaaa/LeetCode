class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        Queue<T> min = new PriorityQueue<>((a,b)->a.num-b.num);
        
        for(int i=0;i<k && i<matrix.length;i++){
            min.offer(new T(i,0,matrix[i][0]));
        }
        
        while(k-->1){
            int i = min.peek().i;
            int j = min.poll().j;
            
            if(j+1<matrix[0].length)
                min.offer(new T(i, j+1, matrix[i][j+1]));
        }
        
        return min.peek().num;
    }
}

class T{
    int i;
    int j;
    int num;
    
    public T(int i, int j, int num){
        this.i = i;
        this.j = j;
        this.num = num;
    }
}