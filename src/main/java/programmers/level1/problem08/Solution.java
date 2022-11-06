package programmers.level1.problem08;

public class Solution {

    public String solution(String s) {
        int divisor = s.length() / 2;

        return s.length() % 2 == 0 ?
            s.substring( divisor-1, divisor+1 ) :
            s.substring( divisor, divisor+1);
    }

}
