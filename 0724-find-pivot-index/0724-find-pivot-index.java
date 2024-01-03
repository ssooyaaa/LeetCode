class Solution {
    public int pivotIndex(int[] nums) {
        
        int idx = -1;
        
        int leftSum = 0;
        int rightSum = 0;
        for(int i=1;i<nums.length;i++){
            rightSum += nums[i];
        }
        
        int currentIdx = 0;
        
        while(currentIdx<nums.length-1){
            if(rightSum==leftSum){
                return idx = currentIdx;
            }
            System.out.println(leftSum+" "+rightSum+" "+currentIdx);
            leftSum += nums[currentIdx];
            currentIdx++;
            rightSum -= nums[currentIdx];
        }
        
        System.out.println(currentIdx);
            
        if(currentIdx==nums.length-1){
            System.out.println(leftSum+" "+rightSum+" "+currentIdx);
            if(rightSum==leftSum) return idx = currentIdx;
        }
        
        return idx;
        
    }
}