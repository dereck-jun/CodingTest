package programmers;

public class 두_수의_곱 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result1 = solution.solution(3, 4);
        System.out.println(result1);
    }

    static class Solution {
        public int solution(int num1, int num2) {
            return num1 * num2;
        }
    }
}
