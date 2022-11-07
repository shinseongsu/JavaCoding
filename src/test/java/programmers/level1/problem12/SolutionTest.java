package programmers.level1.problem12;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("약수의 개수와 덧셈")
    @ParameterizedTest
    @CsvSource(value = {
        "13 17=43",
        "24 27=52"
    }, delimiter = '=')
    void 약수의_개수와_덧셈(String input, int answer) {
        int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        Solution solution = new Solution();

        assertThat(solution.solution(arr[0], arr[1])).isEqualTo(answer);
    }

}