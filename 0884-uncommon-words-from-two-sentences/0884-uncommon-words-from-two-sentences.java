class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String combined = s1 + " " + s2;
        String[] words = combined.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        // count frequency
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // collect uncommon words
        ArrayList<String> list = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }

        return list.toArray(new String[0]);
    }
}