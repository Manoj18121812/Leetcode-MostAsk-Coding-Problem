import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // count frequency
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        // keys into array
        Integer[] arr = map.keySet().toArray(new Integer[0]);

        // sort by frequency (high → low)
        Arrays.sort(arr, (a, b) -> map.get(b) - map.get(a));

        // take first k
        int[] ans = new int[k];
        for (int i = 0; i < k; i++)
            ans[i] = arr[i];

        return ans;
    }
}
