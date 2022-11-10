package programmers.level1.problem22;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("문자열 내 마음대로 정렬하기")
    @ParameterizedTest
    @MethodSource("parameters")
    void 문자열_내_마음대로_정렬하기(String[] inputs, int n, String[] result) {
        Solution solution = new Solution();

        assertThat(solution.solution(inputs, n)).isEqualTo(result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                arguments(new String[]{"sun", "bed", "car"}, 1, new String[]{"car", "bed", "sun"}),
                arguments(new String[]{"abce", "abcd", "cdx"}, 2, new String[]{"abcd", "abce", "cdx"})
        );
    }

}