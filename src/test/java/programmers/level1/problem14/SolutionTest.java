package programmers.level1.problem14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("행렬의 덧셈")
    @ParameterizedTest
    @CsvSource(value = {
        "1 2,2 3|3 4,5 6=4 6,7 9",
        "1 2|3 4=4 6"
    }, delimiter = '=')
    void 행렬의_덧셈(String input, String answer) {
        Solution solution = new Solution();
        String[] splitInput = input.split("\\|");

        int[][] arr1 = makeArr( splitInput[0].split(","));
        int[][] arr2 = makeArr( splitInput[1].split(","));
        int[][] arr3 = makeArr( answer.split(",") );

        assertThat(solution.solution(arr1, arr2)).isEqualTo(arr3);
    }

    private int[][] makeArr(String[] splitArr) {
        int[][] result = new int[splitArr.length][splitArr[0].split(",")[0].split(" ").length];

        for(int i = 0 ; i < splitArr.length ; i++) {
            String[] splitValue = splitArr[i].split(" ");

            for(int j = 0 ; j < splitValue.length ; j++) {
                result[i][j] = Integer.parseInt(splitValue[j]);
            }
        }

        return result;
    }

}