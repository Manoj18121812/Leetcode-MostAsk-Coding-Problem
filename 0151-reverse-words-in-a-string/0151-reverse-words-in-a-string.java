class Solution {
    public String reverseWords(String s) {
        /*
        String words[]= s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0)sb.append(" ");
        }
        return sb.toString();

*/



         String word[]= s.split(" +");
         StringBuilder sb = new StringBuilder();

         for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            sb.append(" ");
         }

         return sb.toString().trim();
    }
}