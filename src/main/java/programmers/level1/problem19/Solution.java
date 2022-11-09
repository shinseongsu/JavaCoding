package programmers.level1.problem19;

import java.util.Arrays;

public class Solution {

    public int solution(int[] d, int budget) {
        int result = 0;
        int currentBudget = 0;
        Arrays.sort(d);

        for(int dgreed : d) {
            if(currentBudget + dgreed <= budget) {
                result++;
                currentBudget += dgreed;
            } else {
                break;
            }
        }

        return result;
    }

}
