class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int previoussum=0;

        for(int i=0;i < k;i++){
            previoussum=previoussum+nums[i];
        }

        int maxsum=previoussum;

        for(int i=k;i <= nums.length-1;i++){

                 
            int currentsum=previoussum-nums[i-k]+nums[i];
            
            if (currentsum > maxsum){
                maxsum =currentsum;
            }
            previoussum=currentsum;
        }
        
        return (double) maxsum/k;
    }
}