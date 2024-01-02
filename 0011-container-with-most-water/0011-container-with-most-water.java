class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int left = 0;
        int right = height.length-1;
        
        while(left<right){
            max = Math.max(max, getWater(left, right, height));
            
            if(height[left]<height[right]) left++;
            else right--;
        }
        
        return max;
    }
    
    public int getWater(int left, int right, int[] height){
        int width = right-left;
        int h = Math.min(height[left], height[right]);
        
        return width*h;
    }
}