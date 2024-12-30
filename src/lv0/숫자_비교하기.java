package lv0;

public class 숫자_비교하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result1 = solution.solution(3, 3);
        int result2 = solution.solution(3, 4);

        System.out.println(result1);
        System.out.println(result2);
    }

    static class Solution {
        public int solution(int num1, int num2) {
            return num1 == num2 ? 1 : -1;
        }
    }
}
