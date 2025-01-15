package programmers;

public class 시저_암호 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ab = solution.solution("z", 1);
        System.out.println(ab);
    }

    static class Solution {
        public String solution(String s, int n) {
            char[] charArray = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                if (c == ' ') {
                    sb.append(' ');
                    continue;
                }

                char tmp = (char) (c + n);
                if (c >= 65 && c <= 90 && tmp > 90) {
                    tmp = (char) (65 + (tmp - 91));
                }
                if (c >= 97 && c <= 122 && tmp > 122) {
                    tmp = (char) (97 + (tmp - 123));
                }
                sb.append(tmp);
            }
            return sb.toString().trim();
        }
    }
}
