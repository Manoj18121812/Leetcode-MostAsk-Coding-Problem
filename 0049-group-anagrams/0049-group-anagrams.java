class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();

        for(String str:strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            map.computeIfAbsent(key,k-> new ArrayList<>())
               .add(str);
        }
        return new ArrayList<>(map.values());
    }
}/*import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        Solution sol = new Solution();
        sol.groupAnagrams(strs); // directly print

        sc.close();
    }
}

class Solution {

    public void groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        // Print result
        System.out.println("\nGrouped Anagrams:");
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
} */