package programmers.level1.problem21;

import java.util.Arrays;

public class Solution {

    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for(int[] arr : sizes) {
            Arrays.sort(arr);

            width = Math.max(width, arr[0]);
            height = Math.max(height, arr[1]);
        }

        return width * height;
    }

}
