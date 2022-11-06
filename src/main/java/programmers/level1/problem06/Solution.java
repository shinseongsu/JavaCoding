package programmers.level1.problem06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int number : arr) {
            if(number % divisor == 0) {
                answer.add(number);
            }
        }

        if(answer.size() == 0) {
            answer.add(-1);
        }

        Collections.sort(answer);

        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}
