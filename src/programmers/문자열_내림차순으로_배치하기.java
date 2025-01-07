package programmers;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("zZeksSa");
        System.out.println(result);
    }

    static class Solution {
        public String solution(String s) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            return new StringBuilder().append(charArray).reverse().toString();
        }
    }
}
