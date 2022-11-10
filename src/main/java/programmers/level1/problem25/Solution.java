package programmers.level1.problem25;

public class Solution {

    // 에라토스테네스의 체
    public int solution(int n) {
        int result = 0;
        boolean[] prime = new boolean[n+1];
        prime[0] = true;

        int root = (int)Math.sqrt(n);
        for(int i = 2 ; i <= root ; i++) {
            if(prime[i] == false) {
                for(int j = i;  i*j<=n ; j++) {
                    prime[i *j] = true;
                }
            }
        }

        for(int i = 2; i < prime.length ; i++ ) {
            if(prime[i] == false) {
                result++;
            }
        }
        return result;
    }

}
