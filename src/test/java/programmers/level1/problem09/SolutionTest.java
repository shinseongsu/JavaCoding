package programmers.level1.problem09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("수박수박수박수박수박수")
    @ParameterizedTest
    @CsvSource(value = {
        "3=수박수",
        "4=수박수박"
    }, delimiter = '=')
    void 수박(int count, String answer) {
        Solution solution = new Solution();

        assertThat(solution.solution(count)).isEqualTo(answer);
    }

}