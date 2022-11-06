package programmers.level1.problem08;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("가운데 글자 가져오기")
    @ParameterizedTest
    @CsvSource(value = {
        "abcde=c",
        "qwer=we"
    }, delimiter = '=')
    void 가운데_글자_가져오기(String input, String answer) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(answer);
    }

}