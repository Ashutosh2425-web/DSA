import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ThreeSum {
    public List<List<Integer>> threesum(int []nums){

        List<List<Integer>> result=new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i < nums.length-2; i++){

            int left=i+1;
            int right=nums.length-1;

            if(i > 0 && nums[i]==nums[i-1]){
                continue;
            }

            int fixedElement=nums[i];

            int target=-fixedElement;

            while(left < right){
                int sum=nums[left]+nums[right];

                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    left++;
                    right--;

                    while(left < right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right]==nums[right+1]){
                       right--;
                    }

                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}

