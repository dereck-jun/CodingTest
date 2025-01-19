package programmers;

import java.util.HashSet;
import java.util.Set;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{2, 1, 3, 4, 1});
        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
            return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
    }
}