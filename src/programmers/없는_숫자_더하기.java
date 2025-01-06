package programmers;

import java.util.Arrays;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] numbers) {
            return 45 - Arrays.stream(numbers).sum();

/*
            int answer = 45;
            for (int num : numbers) {
                answer -= num;
            }
            return answer;
*/
        }
    }
}
