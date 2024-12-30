package lv0;

public class 자릿수_구하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(123);
        System.out.println(result);
    }

    static class Solution {
        int answer = 0;

        public int solution(int n) {
            while (n > 0) {
                answer += n % 10;

                if (n < 10) {
                    break;
                }

                n /= 10;
            }
            return answer;
        }
    }
}
