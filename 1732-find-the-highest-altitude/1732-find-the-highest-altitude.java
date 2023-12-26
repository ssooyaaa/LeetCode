class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] alt = new int[gain.length+1];
        alt[0] = 0;
        alt[1] = gain[0];
        
        for(int i=1;i<gain.length;i++){
            int sum = alt[i]+gain[i];
            alt[i+1] = sum;
        }
        
        Arrays.sort(alt);
        
        return alt[alt.length-1];
    }
}