package programmers.level1.problem07;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] < min) {
                min = Math.min(arr[i], min);
                minIndex = i;
            }
            answer.add(arr[i]);
        }
        answer.remove(minIndex);

        return answer.size() == 0 ?
            new int[] { -1 } :
            answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}
