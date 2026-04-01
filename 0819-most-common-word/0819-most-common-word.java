class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String words[] = paragraph.split(" ");

        Set<String> set = new HashSet<>();
        for (String ch : banned) {
            set.add(ch);
        }

        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String result = "";

        for (String word : words) {
            if (word.length() == 0 || set.contains(word)) continue;

            map.put(word, map.getOrDefault(word, 0) + 1);

            if (map.get(word) > max) {
                max = map.get(word);
                result = word;
            }
        }
        return result;
    }
}