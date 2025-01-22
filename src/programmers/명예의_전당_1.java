package programmers;

import java.util.PriorityQueue;
import java.util.Queue;

public class 명예의_전당_1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(int k, int[] scores) {
            // 명예의 전당을 관리할 우선순위 큐
            Queue<Integer> queue = new PriorityQueue<>();
            int[] answer = new int[scores.length];
            for (int i = 0; i < scores.length; i++) {
                // 현재 점수 추가
                queue.add(scores[i]);

                // 명예의 전당 크기가 k를 넘어서면 최솟값 제거
                if (queue.size() > k) {
                    queue.poll();
                }

                // 현재 명예의 전당에서 가장 낮은 점수를 결과에서 추가
                answer[i] = queue.peek();
            }
            return answer;
        }
    }
}
