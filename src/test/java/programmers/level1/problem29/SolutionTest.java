package programmers.level1.problem29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("햄버거 만들기")
    @ParameterizedTest
    @MethodSource("parameters")
    void 햄버거_만들기(int[] parameters, int result) {
        Solution solution = new Solution();

        assertThat(solution.solution(parameters)).isEqualTo(result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
            arguments(new int[] { 2, 1, 1, 2, 3, 1, 2, 3, 1 }, 2),
            arguments(new int[] { 1, 3, 2, 1, 2, 1, 3, 1, 2 }, 0)
        );
    }

}