package lv0;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{5, 9, 7, 10}, 5);
        for (int num : result) {
            System.out.println(num);
        }
    }

    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .sorted()
                .toArray();

            if (answer.length == 0) {
                return new int[]{-1};
            }

            return answer;
        }
    }
}
