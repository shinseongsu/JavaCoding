package programmers.level1.problem07;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("제일 작은 수 제거하기")
    @ParameterizedTest
    @CsvSource(value = {
        "4,3,2,1=4,3,2",
        "10=-1"
    }, delimiter = '=')
    void 제일_작은_수_제거하기(String input, String answer) {
        int[] inputs = Arrays.stream(input.split(",")).mapToInt(Integer::valueOf).toArray();
        int[] result = Arrays.stream(answer.split(",")).mapToInt(Integer::valueOf).toArray();

        Solution solution = new Solution();

        assertThat(solution.solution(inputs)).isEqualTo(result);
    }

}