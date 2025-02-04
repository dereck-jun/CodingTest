package programmers;

public class 덧칠하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(8, 4, new int[]{2, 3, 6});
        System.out.println("result = " + result);
    }

    static class Solution {
        public int solution(int n, int m, int[] section) {
            int count = 0;
            int distance = 0;
            for (int i = 0; i < section.length; i++) {
                if (section[i] <= distance) {
                    continue;
                }

                distance = section[i] + m - 1;
                count++;
            }
            return count;
        }
    }
}
