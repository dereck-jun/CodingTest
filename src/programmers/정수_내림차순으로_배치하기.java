package programmers;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(118372);
        System.out.println(result);
    }

    static class Solution {
        public long solution(long n) {
            String str = String.valueOf(n);
            char[] digits = str.toCharArray();  // toCharArray => 문자로 나눠서 배열로 저장
            Arrays.sort(digits);    // 오름차순으로 정렬

            // digits 배열을 문자열로 만드는 것과 동일. 거꾸로 돌려서 내림차순으로 만듦
            String string = new StringBuilder().append(digits).reverse().toString();    
            return Long.parseLong(string);
        }
    }
}
