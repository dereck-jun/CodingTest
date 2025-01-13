package programmers;

public class 삼총사 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println(result);
    }

    static class Solution {
        int count = 0;
        int[] temp;

        public int solution(int[] number) {
            temp = number;
            find(0, 0, 0);
            return count;
        }

        private void find(int start, int level, int sum) {
            if (level == 3) {
                if (sum == 0) {
                    count += 1;
                }
                return;
            }

            for (int i = start; i < temp.length; i++) {
                find(i + 1, level + 1, sum + temp[i]);
            }
        }
    }
}
