package programmers.level1.problem11;

public class Solution {
    public boolean solution(String s) {
        char[] arr = s.toCharArray();

        if(s.length() != 4 && s.length() != 6) {
            return false;
        }

        for(char c : arr) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
