package programmers.level1.problem10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @DisplayName("문자열 내림차순으로 배치하기")
    @Test
    void 문자열_내림차순으로_배치하기() {
        Solution solution = new Solution();
        assertThat(solution.solution("Zbcdefg")).isEqualTo("gfedcbZ");
    }

}