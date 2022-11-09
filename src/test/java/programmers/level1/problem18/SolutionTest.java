package programmers.level1.problem18;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("3진법 뒤집기")
    @ParameterizedTest
    @CsvSource(value = {
            "45=7",
            "125=229"
    }, delimiter = '=')
    void 진법_뒤집기(int input, int answer) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(answer);
    }

}