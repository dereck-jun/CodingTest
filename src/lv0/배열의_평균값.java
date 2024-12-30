package lv0;

import java.util.stream.IntStream;

public class 배열의_평균값 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double result = solution.solution(numbers);
        System.out.println(result);
    }

    static class Solution {
        public double solution(int[] numbers) {
            return ( (double) IntStream.of(numbers).sum() / numbers.length);
        }
    }
}
