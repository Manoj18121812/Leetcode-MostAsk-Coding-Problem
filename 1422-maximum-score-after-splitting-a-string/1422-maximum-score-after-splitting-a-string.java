class Solution {
    public int maxScore(String s) {

        int totalOnes = 0;

        // Count total ones
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                totalOnes++;
            }
        }

        int leftZero = 0;
        int rightOnes = totalOnes;
        int maxScore = 0;

        // Try all splits
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == '0') {
                leftZero++;
            } else {
                rightOnes--;
            }

            maxScore = Math.max(maxScore, leftZero + rightOnes);
        }

        return maxScore;
    }
}