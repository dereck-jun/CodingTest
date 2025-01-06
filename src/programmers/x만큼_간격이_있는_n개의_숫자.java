package programmers;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] result = solution.solution(-4, 1);
        Arrays.stream(result).forEach(System.out::println);
    }

    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            answer[0] = x;

            for (int i = 1; i < n; i++) {
                answer[i] = answer[i - 1] + x;
            }

            return answer;
        }
    }
}
