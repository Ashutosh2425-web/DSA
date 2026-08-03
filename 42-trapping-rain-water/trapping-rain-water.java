class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;

        int leftmax=height[left];
        int rightmax=height[right];

        int water=0;

        while(left < right){

            if(height[left] < height[right]){
                
                if(height[left] >= leftmax){
                    leftmax=height[left];
                }else{
                    water=water+leftmax-height[left];
                }
                left++;
            }else{
                if(height[right] >= rightmax){
                    rightmax=height[right];
                }else{
                    water=water+rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}