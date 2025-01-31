package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class 과일_장수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        System.out.println("result = " + result);
    }

    static class Solution {
        public int solution(int k, int m, int[] scores) {
            int min = 10;
            int answer = 0;
            Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
            for (int score : scores) {
                queue.add(score);
            }
            while (queue.size() >= m) {
                for (int i = 0; i < m; i++) {
                    min = Math.min(queue.peek(), min);
                    queue.poll();
                }
                answer += (min * m);
            }
            return answer;
        }
//        public int solution(int k, int m, int[] score) {
//            int answer = 0;
//
//            Arrays.sort(score);
//
//            for (int i = score.length; i >= m; i -= m) {
//                answer += score[i - m] * m;
//            }
//
//            return answer;
//        }
    }
}
