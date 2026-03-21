class Solution {
    public String reverseOnlyLetters(String s) {
        
        Stack<Character>stack = new Stack<>();

        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch)){
                result.append(stack.pop());
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}