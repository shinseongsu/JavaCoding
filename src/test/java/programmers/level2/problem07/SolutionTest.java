package programmers.level2.problem07;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {

    @DisplayName("캐시")
    @ParameterizedTest
    @MethodSource("paramters")
    void 캐시(int cacheSize, String[] cities, int result) {
        Solution solution = new Solution();
        assertThat( solution.solution(cacheSize, cities) ).isEqualTo(result);
    }

    private static Stream paramters() {
        return Stream.of(
            arguments(3, new String[] { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" }, 50 )
        );
    }

}