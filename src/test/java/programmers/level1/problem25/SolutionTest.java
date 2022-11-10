package programmers.level1.problem25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("소수 찾기")
    @ParameterizedTest
    @CsvSource(value = {
            "10=4",
            "5=3"
    }, delimiter = '=')
    void 소수찾기(int input, int result) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(result);
    }

}