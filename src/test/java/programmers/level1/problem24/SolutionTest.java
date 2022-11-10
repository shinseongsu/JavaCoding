package programmers.level1.problem24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("2016년")
    @Test
    void 이천십육년() {
        Solution solution = new Solution();

        assertThat(solution.solution(5, 24)).isEqualTo("TUE");
    }

}