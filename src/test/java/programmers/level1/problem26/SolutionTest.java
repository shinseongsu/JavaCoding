package programmers.level1.problem26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("콜라 문제")
    @ParameterizedTest
    @MethodSource("parameters")
    void 콜라(int a, int b, int n, int result) {
        Solution solution = new Solution();

        assertThat(solution.solution(a, b, n)).isEqualTo(result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
            arguments(2, 1, 20, 19),
            arguments(3, 1, 20, 9)
        );
    }

}