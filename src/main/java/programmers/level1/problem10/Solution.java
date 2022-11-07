package programmers.level1.problem10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        return Arrays.stream(arr).map(i -> i).collect(Collectors.joining());
    }
}
