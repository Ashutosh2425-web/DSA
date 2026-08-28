public class PivotIndex {
    public int findpivot(int[] nums){
        int totalsum=0;
        for(int num:nums){
            totalsum=totalsum+num;
        }
        int leftsum=0;
        for(int i=0;i< nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
}
