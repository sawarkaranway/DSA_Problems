class Solution {
    public int maxArea(int[] height) {
        //int area = length * breadth;
        int maxArea=0;
        int left=0;
        int right = height.length - 1;
        while(left<right){
        
            int area;
            int h = (height[left] < height[right]) ? height[left] : height[right];
            int b = right-left;
            area = h*b;
            maxArea= Math.max(maxArea,area);
            if(height[right]>height[left]){
                left++;
            }
            else{
                right--;
            }
                
            

        }
        return maxArea;
}
}