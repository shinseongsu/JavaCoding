package programmers.level2.problem04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("멀티뛰기")
    @ParameterizedTest
    @CsvSource(value = {
            "4=5",
            "3=3"
    }, delimiter = '=')
    void 멀리뛰기(int input, int result) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(result);
    }

}