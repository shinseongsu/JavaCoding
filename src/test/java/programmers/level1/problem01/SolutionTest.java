package programmers.level1.problem01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @DisplayName("정수 내림차순 배치하기 테스트")
    @Test
    void 정수_내림차순_배치하기() {
        Solution solution = new Solution();

        long answer = solution.solution(873211);

        assertThat(answer).isEqualTo(873211);
    }

}