class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;

        for(int right=1; right <=nums.length-1;right++){
            if(nums[left] != nums[right]){
                left++;
                nums[left]=nums[right];
            }
        }
        return left+1;
    }
}