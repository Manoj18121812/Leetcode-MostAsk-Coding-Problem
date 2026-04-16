class Solution {
    public String reverseOnlyLetters(String s) {
        
       Stack<Character>stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
       for(char ch:s.toCharArray()){
        if(Character.isLetter(ch)){
            stack.add(ch);
        }
       }

       for(char ch:s.toCharArray()){
        if(Character.isLetter(ch)){
            sb.append(stack.pop());
        }else{
            sb.append(ch);
        }
       }
       return sb.toString();
    }
}