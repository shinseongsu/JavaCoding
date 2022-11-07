package programmers.level1.problem11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("문자열 다루기 기본")
    @ParameterizedTest
    @CsvSource(value = {
        "a234=false",
        "1234=true"
    }, delimiter = '=')
    void 문자열_다루기_기본(String input, boolean answer) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(answer);
    }

}