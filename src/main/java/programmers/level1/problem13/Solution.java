package programmers.level1.problem13;

public class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;

        for (int i = 1 ; i <= count ; i++) {
            total += price * i;
        }

        return total - money > 0 ? total - money : 0;
    }
}
