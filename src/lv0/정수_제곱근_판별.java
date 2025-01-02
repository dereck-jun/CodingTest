package lv0;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(121);
        System.out.println(result);
    }

    static class Solution {
        public long solution(long n) {
            if (Math.sqrt(n) % 1 != 0) {
                return -1;
            }
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
    }
}
