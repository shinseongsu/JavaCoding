package programmers.level1.problem12;

public class Solution {
    public int solution(int left, int right) {
        int result = 0;

        for(int i = left ; i <= right ; i++) {
            int count = count(i);

            if(count % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }

        return result;
    }

    private int count(int number) {
        int result = 0;

        for(int i = 1 ; i <= (int) Math.sqrt(number) ; i++) {
            if(number % i == 0) {
                result += number / i == i ? 1 : 2;
            }
        }

        return result;
    }

    // 모법 답안
    public int solution1(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }

}
