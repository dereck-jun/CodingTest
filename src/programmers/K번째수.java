package programmers;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for (int i = 0; i < answer.length; i++) {
                int[] copied = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
                Arrays.sort(copied);
                answer[i] = copied[commands[i][2] - 1];
            }
            return answer;
        }
    }
}
