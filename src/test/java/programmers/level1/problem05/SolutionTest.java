package programmers.level1.problem05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("핸드폰 번호 가리기")
    @ParameterizedTest
    @CsvSource(value = {
        "01033334444=*******4444",
        "027778888=*****8888"
    }, delimiter = '=')
    void 핸드폰_번호_가리기(String input, String answer) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(answer);
    }

}