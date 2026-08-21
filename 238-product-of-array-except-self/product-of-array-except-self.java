class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int leftproduct=1;
        for(int i=0;i< nums.length;i++){
            answer[i]=leftproduct;
            leftproduct=leftproduct*nums[i];
        }
        int rightproduct=1;
        for(int i=nums.length-1;i >=0;i--){
            answer[i]=answer[i]*rightproduct;
            rightproduct=rightproduct*nums[i];
        }
        return answer;
    }
}