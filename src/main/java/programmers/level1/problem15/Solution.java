package programmers.level1.problem15;

import java.util.Scanner;

public class Solution {

    // 시간 복잡도: O(n^2)
    // 공간 복잡도: O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        print(a, b);
    }

    public static void print(int a, int b) {
        for(int i = 0 ; i < b ; i++) {
            System.out.println( "*".repeat(a) );
        }
    }

}
