package programmers;

public class 짝수의_합 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(10);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 2; i <= n; i += 2) {
                answer += i;
            }
            return answer;
//            return IntStream.rangeClosed(0, n).filter(e -> e % 2 == 0).sum();
        }
    }
}
