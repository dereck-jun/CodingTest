package programmers;

public class 두_수의_합 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result1 = solution.solution(2, 3);
        System.out.println(result1);
    }

    static class Solution {
        public int solution(int num1, int num2) {
            return num1 + num2;
        }
    }
}
