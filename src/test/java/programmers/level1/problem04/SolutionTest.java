package programmers.level1.problem04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @DisplayName("서울에서 김서방 찾기")
    @Test
    void 서울에서_김서방_찾기() {
        String[] input = { "Jane", "Kim" };
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo("김서방은 1에 있다");
    }

}