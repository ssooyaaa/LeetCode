class Solution {
    public int countTriplets(int[] arr) {
        
        int n = arr.length;
        
        int[] ar = new int[n+1];
        for(int i=0;i<n;i++){
            ar[i+1] = ar[i]^arr[i];
        }
        
        int answer = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j;k<n;k++){
                    int a = ar[j]^ar[i];
                    int b = ar[k+1]^ar[j];
                    
                    if(a==b) answer++;
                }
            }
        }
        
        return answer;
    }
}