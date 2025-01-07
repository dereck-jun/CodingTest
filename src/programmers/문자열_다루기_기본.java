package programmers;

public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result1 = solution.solution("a234");
        boolean result2 = solution.solution("1234");
        System.out.println(result1);
        System.out.println(result2);
    }

    static class Solution {
        public boolean solution(String s) {
            char[] charArray = s.toCharArray();
            if (s.length() != 4 && s.length() != 6) {
                return false;
            }
            for (int c : charArray) {
                if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
                    return false;
                }
            }
            return true;

            // 정규식을 사용하여 풀 수 있는 걸 알았지만 정규식을 사용할 줄 몰랐음;;
            // if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
            // return false;
        }
    }
}
