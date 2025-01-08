package programmers;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result1 = solution.solution("try  hello  world");
        String result2 = solution.solution("a          a    ");
        System.out.println(result1);
        System.out.println(result2);
    }

    static class Solution {
        public String solution(String s) {
            // 문자열 시작과 끝에 공백이 있을 수 있음
            // 문자열 사이의 공백이 2개 이상일 수도 있음
            // 문자을 바꿀 땐 문자열 기준이 아닌 각 단어의 기준으로 바꿔야 함
            StringBuilder sb = new StringBuilder();
            int idx = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    sb.append(" ");
                    idx = 0;
                } else if (idx % 2 == 0) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    idx++;
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                    idx++;
                }
            }
            return sb.toString();
        }
    }
}
