class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return build(s).equals(build(t));
    }

    private String build(String str){

        Stack<Character>stack= new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch!='#'){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
    }/**import java.util.*;

public class Main {

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // process s
        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                stack1.push(ch);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }

        // process t
        for (char ch : t.toCharArray()) {
            if (ch != '#') {
                stack2.push(ch);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }

        // compare
        boolean result = stack1.equals(stack2);

        System.out.println(result);
    }
} */