package programmers.level1.problem27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("푸드 파이터 대회")
    @ParameterizedTest
    @MethodSource("parameters")
    void 푸드파이터대회(int[] parameters, String result) {
        Solution solution = new Solution();

        assertThat(solution.solution(parameters)).isEqualTo(result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
            arguments(new int[] {1, 3, 4, 6}, "1223330333221"),
            arguments(new int[] {1, 7, 1, 2}, "111303111")
        );
    }

}