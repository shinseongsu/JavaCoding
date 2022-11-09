package programmers.level1.problem19;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("예산")
    @ParameterizedTest
    @CsvSource(value = {
        "1 2 3 4 5,9=3",
        "2 2 3 3,10=4"
    }, delimiter = '=')
    void 예산(String input, int answer) {
        String[] splitInput = input.split(",");
        int[] inputs = Arrays.stream(splitInput[0].split(" ")).mapToInt(Integer::parseInt).toArray();

        Solution solution = new Solution();

        assertThat(solution.solution(inputs, Integer.parseInt(splitInput[1]))).isEqualTo(answer);
    }

}