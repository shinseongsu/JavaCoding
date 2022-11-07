package programmers.level1.problem13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @DisplayName("부족한 금액 계산하기")
    @Test
    void 부족한_금액_계산하기() {
        Solution solution = new Solution();

        assertThat(solution.solution(3, 20, 4)).isEqualTo(10);
    }

}