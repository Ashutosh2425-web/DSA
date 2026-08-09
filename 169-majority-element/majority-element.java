class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int votecount=0;
        for(int num:nums){
            if(votecount==0){
                candidate=num;
            }
            if(candidate==num){
                votecount++;
            }else{
                votecount--;
            }
        }
        return candidate;
    }
}