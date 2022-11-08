package programmers.level1.problem16;

public class Solution {

    // 시간복잡도 : O( max(log n, log m) )
    // 공간복잡도 : O(1)
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        answer[0] = gcd(max, min);
        answer[1] = lcm(max, min, answer[0]);

        return answer;
    }

    // 유클리드 호재법
    // 나머지가 0이 될때까지 나누면 최대 공배수를 알 수 있다.
    private int gcd(int n, int m) {
        if(m == 0) {
            return n;
        }
        return gcd(m, n%m);
    }

    // 두 수를 곱한 후, 최대 공배수로 나누면 최소공배수가 나온다.
    private int lcm(int n, int m, int gcd) {
        return n * m / gcd;
    }

}
