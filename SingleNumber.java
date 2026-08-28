public class SingleNumber {
    public int singlenumer(int[] nums){
        int result=0;
        for(int num:nums){
            result=result^num;
        }
        return result;
    }
}
