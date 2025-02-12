package programmers;

import java.util.HashSet;
import java.util.Set;

public class 체육복 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(5, new int[]{2, 4}, new int[]{3});
        System.out.println("result = " + result);
    }

    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            Set<Integer> lostSet = new HashSet<>();
            Set<Integer> reserveSet = new HashSet<>();

            for (int l : lost) lostSet.add(l);

            for (int r : reserve) {
                if (lostSet.contains(r)) {
                    lostSet.remove(r);
                } else {
                    reserveSet.add(r);
                }
            }

            for (int r : reserveSet) {
                if (lostSet.contains(r - 1)) {
                    lostSet.remove(r - 1);
                } else if (lostSet.contains(r + 1)) {
                    lostSet.remove(r + 1);
                }
            }

            return n - lostSet.size();
        }
    }
}
