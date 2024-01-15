class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        
        int n = nums1.length;
        
        int[][] nums = new int[n][2];
        for(int i=0;i<n;++i){
            nums[i] = new int[]{nums1[i], nums2[i]};
        }
        
        Arrays.sort(nums, (a,b)->b[1]-a[1]);
        
        long answer = 0;
        long score = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;++i){
            score += nums[i][0];
            pq.add(nums[i][0]);
            
            if(pq.size()==k){
                answer = Math.max(answer, score*nums[i][1]);
                score -= pq.poll();
            }
        }
        
        return answer;
    }
}