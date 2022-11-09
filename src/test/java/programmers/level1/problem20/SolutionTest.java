package programmers.level1.problem20;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    
    @DisplayName("시저암호")
    @ParameterizedTest
    @CsvSource(value = {
        "AB,1=BC",
        "z,1=a",
        "a B z,4=e F d"
    }, delimiter = '=')
    void 시저_암호(String input, String answer) {
        String[] arr = input.split(",");

        Solution solution = new Solution();

        assertThat( solution.solution(arr[0], Integer.parseInt(arr[1])) ).isEqualTo(answer);
    }
    
}