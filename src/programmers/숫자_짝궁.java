package programmers;

public class 숫자_짝궁 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("5525", "1255");
        System.out.println("result = " + result);
    }

    static class Solution {
        public String solution(String X, String Y) {
            int[] cntX = new int[10];
            int[] cntY = new int[10];
            for (int i = 0; i < X.length(); i++) {
                cntX[X.charAt(i) - '0']++;
            }
            for (int i = 0; i < Y.length(); i++) {
                cntY[Y.charAt(i) - '0']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int d = 9; d >= 0; d--) {
                int common = Math.min(cntX[d], cntY[d]);
                for (int j = 0; j < common; j++) {
                    sb.append(d);
                }
            }

            if (sb.length() == 0) return "-1";
            if (sb.charAt(0) == '0') return "0";

            return sb.toString();
        }
    }
}
