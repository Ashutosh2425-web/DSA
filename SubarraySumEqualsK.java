import java.util.HashMap;
public class SubarraySumEqualsK {
    public int subarraysum(int[] nums,int k){

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);

        int currentsum=0;
        int count=0;

        for(int num:nums){
            currentsum=currentsum+num;
            int needed=currentsum-k;
            if(map.containsKey(needed)){
                count +=map.get(needed);
            }
            map.put(currentsum,map.getOrDefault(currentsum,0)+1);
        }
        return count;
    }
}
