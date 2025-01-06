package programmers;

public class 내적 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] a, int[] b) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i] * b[i];
            }
            return sum;
        }
    }
}
