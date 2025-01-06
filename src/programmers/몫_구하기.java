package programmers;

public class 몫_구하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.solution(10, 5);
        int result2 = solution.solution(7, 2);

        System.out.println(result1);
        System.out.println(result2);
    }

    static class Solution {
        public int solution(int num1, int num2) {
            return num1 / num2;
        }
    }
}
