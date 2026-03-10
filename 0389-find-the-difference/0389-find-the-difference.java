import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {

        Set<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            set.add(ch);
        }

        for(char ch : t.toCharArray()){
            if(!set.contains(ch)){
                return ch;
            }else{
                set.remove(ch);
            }
        }

        return ' ';
    }
}