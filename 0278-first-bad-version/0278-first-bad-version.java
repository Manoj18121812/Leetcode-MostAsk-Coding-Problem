/*public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for (int i = 1; i <= n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return -1;
    }
}*/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int ans = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                ans = mid;        // store possible answer
                right = mid - 1;  // search left side
            } else {
                left = mid + 1;   // search right side
            }
        }

        return ans;
    }
}

