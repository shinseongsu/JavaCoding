package programmers.level1.problem17;

public class Solution {

    public String solution(String s) {
        StringBuffer result = new StringBuffer("");
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                result.append(" ");
                index = 0;
                continue;
            }

            result.append( (index%2) == 0 ? String.valueOf(Character.toUpperCase(c)) : String.valueOf(Character.toLowerCase(c)) );
            index++;
        }

        return result.toString();
    }

}
