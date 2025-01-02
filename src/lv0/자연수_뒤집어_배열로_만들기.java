package lv0;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(12345);
        Arrays.stream(result).forEach(System.out::println);
    }

    static class Solution {
        public int[] solution(long n) {
            return new StringBuilder()
                .append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        }
    }
}
