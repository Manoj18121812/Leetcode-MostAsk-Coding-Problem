class Solution {
    public boolean backspaceCompare(String s, String t) {
        return builds(s).equals(builds(t));
    }

    private String builds(String str){
        Stack<Character>stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch !='#'){
                stack.push(ch);
            }else if(!stack.isEmpty()){
                    stack.pop();
            }
        }
        return stack.toString();
    }
}