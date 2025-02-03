package programmers;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1, 1, 4, 4, 2, 4, 5, 1, 5, 2, 3, 4, 4, 4, 1, 2, 5});
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int[] scores = new int[3];
            int[] s1 = {1, 2, 3, 4, 5};
            int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == s1[i % s1.length]) {
                    scores[0]++;
                }
                if (answers[i] == s2[i % s2.length]) {
                    scores[1]++;
                }
                if (answers[i] == s3[i % s3.length]) {
                    scores[2]++;
                }
            }

            int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                if (scores[i] == max) {
                    result.add(i + 1);
                }
            }

            return result.stream().mapToInt(i -> i).toArray();
        }
    }
}
