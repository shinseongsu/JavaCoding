package programmers.level1.problem16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("최대공약수와 최소공배수")
    @ParameterizedTest
    @CsvSource(value = {
            "3 12=3 12",
            "2 5=1 10"
    }, delimiter = '=')
    void 최대공약수와_최소공배수(String input, String answer) {
        int[] splitInput = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] splitAnswer = Arrays.stream(answer.split(" ")).mapToInt(Integer::parseInt).toArray();

        Solution solution = new Solution();

        assertThat(solution.solution(splitInput[0], splitInput[1])).isEqualTo(splitAnswer);
    }

}