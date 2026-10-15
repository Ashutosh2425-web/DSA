class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (stack.length() > 0 &&
                Math.abs(stack.charAt(stack.length() - 1) - ch) == 32) {

                stack.deleteCharAt(stack.length() - 1);

            } else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}