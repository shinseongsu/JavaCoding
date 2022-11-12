package programmers.level2.problem02;

import java.util.Stack;

// 시간복잡도 : O(n^n)
// 공간복잡도 : O(n)
public class Solution {
    public int[] solution(int n, String[] words) {
        Stack<String> stack = new Stack<>();

        for(int i = 0 ; i < words.length ; i++) {
            if(stack.contains(words[i])) {
                return new int[] {  i % n + 1, i / n + 1  };
            }

            if(!stack.isEmpty()) {
                String preString = stack.peek().substring(stack.peek().length()-1);
                String currentString = words[i].substring(0, 1);

                if(!preString.equals(currentString)) {
                    return new int[] {  i % n + 1, i / n + 1  };
                }
            }

            stack.push(words[i]);
        }

        return new int[] { 0, 0 };
    }
}
