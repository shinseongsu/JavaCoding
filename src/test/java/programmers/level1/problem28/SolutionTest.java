package programmers.level1.problem28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("숫자 짝궁")
    @ParameterizedTest
    @MethodSource("parameters")
    void 숫자_짝궁(String X, String Y, String result) {
        Solution solution = new Solution();

        assertThat(solution.solution(X,Y)).isEqualTo(result);
    }

    private static Stream<Arguments> parameters(){
        return Stream.of(
                arguments("100", "2345", "-1"),
                arguments("100", "203045", "0"),
                arguments("100", "123450", "10"),
                arguments("12321", "42531", "321"),
                arguments("5525", "1255", "552")
        );
    }

}