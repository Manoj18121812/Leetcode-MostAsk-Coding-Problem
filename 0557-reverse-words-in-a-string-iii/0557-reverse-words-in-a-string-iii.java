class Solution {
    public String reverseWords(String s) {
        
       String words[]= s.split(" ");

       StringBuilder sb = new StringBuilder();

       for(String word:words){
        StringBuilder sb1 = new StringBuilder(word);
        sb.append(sb1.reverse().append(" "));
       }
       return sb.toString().trim();
    }
}