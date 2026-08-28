import java.util.HashMap;
class TwoSum{
   public int[] twosum(int[]nums,int target){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0; i<nums.length;i++){
        int need=target-nums[i];
        if(map.containsKey(need)){
            return new int[]{map.get(need),i};
        }
        map.put(nums[i], i);
    }
    return null;
    }
}
//----------------------------------------------------------
//bruteforce approach
//class TwoSum{
    //public int[] twosum(int[]nums,int target){
        //for(int i=0;i<nums.length;i++){
            //for(int j=i+1;j<nums.length;j++){
                //if(nums[i]+nums[j]==target){
                   // return new int[]{i,j};
               // }
           // }
       // }
        //return null;
   //}
//}
