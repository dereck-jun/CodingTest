package programmers;

public class 나이_출력 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(40);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int age) {
            return 2022 - age + 1;
        }
    }
}
