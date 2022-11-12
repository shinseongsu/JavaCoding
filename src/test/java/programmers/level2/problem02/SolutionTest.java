package programmers.level2.problem02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("영어 끝말잇기")
    @ParameterizedTest
    @MethodSource("parameters")
    void 영어_끝말잇기(int n, String[] inputs, int[] result) {
        Solution solution = new Solution();

        assertThat(solution.solution(n, inputs)).isEqualTo(result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
            arguments(3,  new String[] { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" }, new int[] { 3, 3}  ),
            arguments(5, new String[] { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive" }, new int[] { 0,0} ),
            arguments(2,  new String[] { "hello", "one", "even", "never", "now", "world", "draw" }, new int[] { 1, 3})
        );
    }

}