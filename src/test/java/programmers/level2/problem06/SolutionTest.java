package programmers.level2.problem06;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("점프와 순간이동")
    @ParameterizedTest
    @CsvSource(value = {
            "5=2",
            "6=2",
            "5000=5"
    }, delimiter = '=')
    void 점프와_순간이동(int N, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(N)).isEqualTo(result);
    }


}