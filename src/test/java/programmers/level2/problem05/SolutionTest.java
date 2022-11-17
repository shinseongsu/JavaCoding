package programmers.level2.problem05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("예상 대진표")
    @ParameterizedTest
    @MethodSource("parameters")
    void 예상_대진표(int N, int A, int B, int answer) {
        Solution solution = new Solution();

        assertThat(solution.solution(N, A, B)).isEqualTo(answer);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                arguments(8, 4, 7, 3)
        );
    }

}