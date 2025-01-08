package programmers;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result1 = solution.solution(3, 12);
        int[] result2 = solution.solution(11, 12);
        for (int i : result1) {
            System.out.println("result 1 > " + i);
        }
        for (int i : result2) {
            System.out.println("result 2 > " + i);
        }
    }

    static class Solution {
        public int[] solution(int n, int m) {
            // 유클리드 호재법을 사용
            // n * m = 최대공약수(GCD) * 최소공배수(LCM)
            // n * m = GCD * GCD * n * m
            // n과 m의 GCD => (m, m % n) 이다. 단 b = 0이면 a가 최대공약수
            int gcd = getGcd(n, m);
            int lcm = getLcm(n, m, gcd);
            return new int[]{gcd, lcm};
        }
    }

    private static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }

    private static int getLcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
