class Solution {
    public String longestPalindrome(String s) {
        int beststart=0;
        int bestlength=1;

        for(int i=0;i<= s.length();i++){
            int oddlength=expand(s,i,i);

            int evenlength=expand(s,i,i+1);

            int longestlength=Math.max(oddlength,evenlength);

            if(longestlength > bestlength){
                bestlength=longestlength;

                beststart=i-(longestlength-1)/2;
            }
        }
        return s.substring(beststart,beststart+bestlength);
    }
    private int expand(String s,int left,int right){
        while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
        left--;
        right++;
        }
        return right-left-1;
    }
}