package programmers.level1.problem01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {
    public long solution(long n) {
        String[] answer = String.valueOf(n).split("");
        Arrays.sort(answer, Comparator.reverseOrder());

        return Long.valueOf(Arrays.stream(answer).collect(Collectors.joining()));
    }
}
