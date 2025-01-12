package programmers;

public class 개미_군단 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(24);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int hp) {
            int ants = 0;
            while (hp != 0) {
                if (hp >= 5) {
                    hp -= 5;
                    ants++;
                } else if (hp >= 3) {
                    hp -= 3;
                    ants++;
                } else {
                    hp -= 1;
                    ants++;
                }
            }
            return ants;
        }
    }
}
