class Solution {
    
    static List<List<Integer>> map;
    static boolean[] visited;
    static int ans;
    
    public int minReorder(int n, int[][] connections) {
        
        map = new ArrayList<>();
        visited = new boolean[n];
        ans = 0;
        
        for(int i=0;i<n;i++){
            map.add(new ArrayList<>());
        }
        
        for(int[] con:connections){
            int a = con[0];
            int b = con[1];
            
            map.get(a).add(b);
            map.get(b).add(-a);
        }
        
        dfs(0);
        
        return ans;
    }
    
    public void dfs(int start){
        
        visited[start] = true;
        
        for(int node : map.get(start)){
            if(visited[Math.abs(node)]==false){
                if(node>=0) ans++;
                
                dfs(Math.abs(node));
            }
        }
    }
}