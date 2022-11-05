package programmers.level1.problem02;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("두 정수 사이의 합")
    @ParameterizedTest
    @CsvSource(value = {
        "3 5=12",
        "3 3=3",
        "5 3=12"
    }, delimiter = '=')
    void 두정수_사이의_합(String str, int answer) {

        int[] input = Arrays.stream(str.split(" ")).mapToInt(Integer::valueOf).toArray();
        Solution solution = new Solution();

        assertThat(solution.solution(input[0], input[1])).isEqualTo(answer);
    }


}