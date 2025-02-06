package programmers;

import java.util.HashMap;
import java.util.Map;

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{31, 10, 45, 1, 6, 19});
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            Map<Integer, Integer> rank = new HashMap<>(
                Map.of(6, 1, 5, 2, 4, 3, 3, 4, 2, 5, 1, 6, 0, 6)
            ); // switch-case 로 바꿀 수 있음
            
            int count = 0;
            int zeroCount = 0;

            for (int lotto : lottos) {
                if (lotto == 0) {
                    zeroCount++;
                    continue;
                }
                for (int winNum : win_nums) {
                    if (lotto == winNum) count++;
                }
            }

            return new int[]{rank.get(count + zeroCount), rank.get(count)};
        }
    }
}
