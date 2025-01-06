package programmers;

public class 두_수의_나눗셈 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(7, 3);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int num1, int num2) {
            return (num1 * 1000) / num2;
        }
    }
}
