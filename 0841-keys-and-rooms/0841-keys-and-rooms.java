class Solution {
    
    Set<Integer> visited;
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        visited = new HashSet<>();
        dfs(0, rooms);
        
        return visited.size()==rooms.size();
    }
    
    public void dfs(int room, List<List<Integer>> rooms){
        if(visited.contains(room)) return;
        
        visited.add(room);
        
        for(int next : rooms.get(room)){
            dfs(next, rooms);
        }
    }
}