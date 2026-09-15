class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=0;

        for(int pile : piles){
            if(pile >= end){
                end=pile;
            }
        }
        while(start < end){
            int mid=start+(end-start)/2;

            int totalhours=0;
            for(int pile:piles){
                totalhours=totalhours+(pile+mid-1)/mid;
            }
            if(totalhours <= h){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}