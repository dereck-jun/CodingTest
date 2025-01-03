package lv0;

import java.util.stream.Stream;

public class 하샤드_수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution(11);
        System.out.println(result);
    }

    static class Solution {
        public boolean solution(int x) {
            int sum = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();

            return x % sum == 0;

            // int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
            // return x % sum == 0;
        }
    }
}
