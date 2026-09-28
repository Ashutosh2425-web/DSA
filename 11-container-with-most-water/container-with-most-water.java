class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int left=0;
        int right=height.length-1;
            while(left < right ){
                int heights=Math.min(height[left],height[right]);
                int width=right-left;
                int area=heights*width;
                if(area>maxarea){
                    maxarea=area;
                }
                if(height[left] < height[right]){
                    left++;
                }else{
                    right--;
                }
            }
        return maxarea;
    }
}