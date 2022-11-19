package programmers.level2.problem08;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("괄호 회전하기")
    @ParameterizedTest
    @MethodSource("parameters")
    void 괄호_회전하기(String input, int result) {
        Solution solution = new Solution();

        assertThat(solution.solution(input)).isEqualTo(result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
            arguments("[](){}", 3),
            arguments("}]()[{", 2),
            arguments("[)(]", 0),
            arguments("}}}", 0)
        );
    }
}