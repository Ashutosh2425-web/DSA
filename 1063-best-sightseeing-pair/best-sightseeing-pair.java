class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxLeft = values[0] + 0;
        int maxScore = 0;

        for (int j = 1; j < values.length; j++) {

            int score = maxLeft + values[j] - j;

            if (score > maxScore) {
                maxScore = score;
            }

            int currentLeft = values[j] + j;

            if (currentLeft > maxLeft) {
                maxLeft = currentLeft;
            }
        }

        return maxScore;
    }
}