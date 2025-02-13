package programmers;

public class 문자열_나누기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("aaabbaccccabba");
        System.out.println("result = " + result);
    }

    static class Solution {
        public int solution(String s) {
            int answer = 0;
            int countX = 0;
            int countOther = 0;
            char current = ' ';

            // 2단계: 문자열 순회
            for (int i = 0; i < s.length(); i++) {
                if (countX == countOther) {
                    current = s.charAt(i);
                    countX = 1;
                } else {
                    if (current == s.charAt(i)) {
                        countX++;
                    } else {
                        countOther++;
                    }
                }

                if (countX == countOther) {
                    answer++;
                    countX = 0;
                    countOther = 0;
                    current = s.charAt(i);
                }
            }

            if (countX != 0) {
                answer++;
            }
            return answer;
        }
    }
}
