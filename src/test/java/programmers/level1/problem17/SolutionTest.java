package programmers.level1.problem17;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("이상한 문자 만들기")
    @Test
    void 이상한_문자_만들() {
        Solution solution = new Solution();

        assertThat(solution.solution("try hello world")).isEqualTo("TrY HeLlO WoRlD");
    }


}