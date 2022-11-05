package programmers.level1.problem03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @DisplayName("클라츠 추측")
    @ParameterizedTest
    @CsvSource(value = {
        "6=8",
        "16=4",
        "626331=-1"
    }, delimiter = '=')
    void 클라츠_추측(int input, int answer) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(answer);
    }

}