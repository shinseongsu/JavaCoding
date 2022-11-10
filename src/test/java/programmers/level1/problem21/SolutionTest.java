package programmers.level1.problem21;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("최소직사각형")
    @ParameterizedTest
    @MethodSource("parameter")
    void 최소직사각형(int[][] input, int result) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(result);
    }

    private static Stream<Arguments> parameter() {
        return Stream.of(
                arguments(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}, 4000),
                arguments(new int[][]{{10,7}, {12,3}, {8,15}, {14, 7}, {5, 15}}, 120),
                arguments(new int[][]{{14,4}, {19,6}, {6,16}, {18,7}, {7,11}}, 133)
            );
    }

}