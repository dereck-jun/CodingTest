package programmers;

public class 짝수와_홀수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result1 = solution.solution(10);
        String result2 = solution.solution(11);

        System.out.println(result1);
        System.out.println(result2);
    }

    static class Solution {
        public String solution(int num) {
            return (num % 2 == 0) ? "Even" : "Odd";
        }
    }
}
