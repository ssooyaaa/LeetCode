class Solution {
    public String predictPartyVictory(String senate) {
        
        Queue<Integer> rQ = new LinkedList<>();
        Queue<Integer> dQ = new LinkedList<>();
        
        int n = senate.length();
        
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R')
                rQ.offer(i);
            else
                dQ.offer(i);
        }
        
        while(!rQ.isEmpty() && !dQ.isEmpty()){
            int rIdx = rQ.poll();
            int dIdx = dQ.poll();
            
            if(rIdx<dIdx)
                rQ.offer(rIdx+n);
            else
                dQ.offer(dIdx+n);
        }
        
        return rQ.isEmpty() ? "Dire" : "Radiant";
    }
}