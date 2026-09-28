class Solution {
    public int characterReplacement(String s, int k) {
         int left=0;
        int maxfrequency=0;
        int maxlength=0;
        int[] frequency=new int[26];

        for(int right=0;right < s.length();right++){
            int index=s.charAt(right)-'A';
            frequency[index]++;
            maxfrequency=Math.max(maxfrequency,frequency[index]);
            
            while(right-left+1-maxfrequency >k){
                index=s.charAt(left)-'A';
                frequency[index]--;
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}