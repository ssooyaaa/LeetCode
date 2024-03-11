class Solution {
    
    List<List<Integer>> answer = new ArrayList<>();
    int N, C;
    
    public List<List<Integer>> combine(int n, int k) {
        
        N = n;
        C = k;
        
        comb(1, new ArrayList<>());
        
        return answer;
        
    }
    
    public void comb(int now, List<Integer> list){
        
        if(list.size()==C){
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=now;i<=N;i++){
            if(list.size()+N-i+1<C) break;
            
            list.add(i);
            comb(i+1, list);
            list.remove(list.size()-1);
        }
    }
}