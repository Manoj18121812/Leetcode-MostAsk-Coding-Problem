class Solution {
    public int mySqrt(int x) {

        if (x == 0) return 0;

        long guess = x;

        while (guess > x / guess) {
            guess = (guess + x / guess) / 2;
        }

        return (int) guess;
    }
}