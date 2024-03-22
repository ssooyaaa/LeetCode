class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int len = gas.length;
        
        int gasSum = 0;
        int costSum = 0;
        
        for(int i=0;i<len;i++){
            gasSum += gas[i];
            costSum += cost[i];
        }
        
        if(gasSum-costSum<0) return -1;
        
        int answer = 0;
        int sum = 0;
        
        for(int i=0;i<len;++i){
            sum += gas[i]-cost[i];
            
            if(sum<0){
                sum = 0;
                answer = i+1;
            }
        }
        
        return answer;
    }
}