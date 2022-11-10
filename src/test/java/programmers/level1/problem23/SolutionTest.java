package programmers.level1.problem23;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("상총사")
    @ParameterizedTest
    @MethodSource("parameters")
    void 상총사(int[] inputs, int result) {
        Solution solution = new Solution();

        assertThat(solution.solution(inputs)).isEqualTo(result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                arguments(new int[] { -2, 3, 0, 2, -5}, 2),
                arguments(new int[] { -3, -2, -1, 0, 1, 2, 3}, 5 ),
                arguments(new int[] { -1, 1, -1, 1 }, 0)
        );
    }

}