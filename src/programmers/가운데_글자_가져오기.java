package programmers;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result1 = solution.solution("qwer");
        String result2 = solution.solution("abcde");
        System.out.println(result1);
        System.out.println(result2);
    }

    static class Solution {
        public String solution(String s) {
            int center = s.length() / 2;
            if (s.length() % 2 == 0) {
                return s.substring(center - 1, center + 1);
            } else {
                return s.substring(center, center + 1);
            }
        }
    }
}
