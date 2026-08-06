import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxlength=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right < s.length();right++){
            char ch=s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}