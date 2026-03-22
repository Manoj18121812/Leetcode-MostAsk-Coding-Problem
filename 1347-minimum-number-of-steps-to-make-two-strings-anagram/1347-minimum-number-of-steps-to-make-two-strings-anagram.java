import java.util.*;

class Solution {
    public int minSteps(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // count s
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int steps = 0;

        // process t
        for(char c : t.toCharArray()) {
            if(map.getOrDefault(c, 0) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                steps++;
            }
        }

        return steps;
    }
}