package programmers.level2.problem08;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {

    private static final Set<Character> inputs = Set.of('(', '{', '[');
    private static final Map<Character, Character> convert = Map.of(')', '(', '}', '{', ']', '[');

    public int solution(String s) {
        int answer = 0;
        String rotateS = s;

        for(int i = 0 ; i < rotateS.length() ; i++) {
            if(checkRotate(rotateS)) answer++;
            rotateS = rotateS.substring(1, s.length()) + rotateS.charAt(0);
        }

        return answer;
    }

    private boolean checkRotate(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(char bracket : s.toCharArray()) {
            if(inputs.contains(bracket)) {
                stack.push(bracket);
                continue;
            }

            if(stack.isEmpty() || stack.peek() != convert.get(bracket)) {
                return false;
            }
            stack.pop();
        }

        return stack.isEmpty() ? answer : false;
    }

}
