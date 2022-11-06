package programmers.level1.problem06;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("나누어 떨어지는숫자 배열")
    @ParameterizedTest
    @CsvSource(value = {
        "5 9 7 10|5=5 10",
        "2 36 1 3|1=1 2 3 36",
        "3 2 6|10=-1"
    }, delimiter = '=')
    void 나누어_떨어지는숫자_배열(String input, String answer) {
        String[] arr = input.split("\\|");

        int[] inputs = Arrays.stream(arr[0].split(" ")).mapToInt(Integer::valueOf).toArray();
        int divisor = Integer.parseInt(arr[1]);
        int[] result = Arrays.stream(answer.split(" ")).mapToInt(Integer::valueOf).toArray();

        Solution solution = new Solution();

        assertThat(solution.solution(inputs, divisor)).isEqualTo(result);
    }

}