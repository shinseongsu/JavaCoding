package programmers.level1.problem04;

public class Solution {
    public String solution(String[] seoul) {
        int answer = -1;

        for(int i = 0 ; i < seoul.length ; i++) {
            if(seoul[i].contains("Kim")) {
                answer = i;
                break;
            }
        }

        return String.format("김서방은 %d에 있다", answer);
    }
}
