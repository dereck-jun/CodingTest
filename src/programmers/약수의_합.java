package programmers;

public class 약수의_합 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(12);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }
            return answer + n;
        }
    }
}
