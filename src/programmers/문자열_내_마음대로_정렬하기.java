package programmers;

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"sun", "bed", "car"}, 1);
        for (String string : result) {
            System.out.println("string = " + string);
        }
    }

    static class Solution {
        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings, (s1, s2) -> {
                if (s1.charAt(n) != s2.charAt(n)) {
                    return s1.charAt(n) - s2.charAt(n);
                }
                return s1.compareTo(s2);
            });
            return strings;
        }
    }
}
