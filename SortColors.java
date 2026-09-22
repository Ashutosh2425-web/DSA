public class SortColors {
    public void swaps(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortcolors(int[] nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid <= high){
            if(nums[mid]==0){
                swaps(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swaps(nums,mid,high);
                high--;
            }
        }
    }
}