package programmers;

public class 기사단원의_무기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(10, 3, 2);
        System.out.println("result = " + result);
    }

    static class Solution {
        public int solution(int number, int limit, int power) {
            int[] count = new int[number + 1];
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number / i; j++) {
                    count[i * j]++;
                }
            }
            int answer = 0;
            for (int i = 1; i <= number; i++) {
                if (count[i] > limit) {
                    answer += power;
                } else {
                    answer += count[i];
                }
            }
            return answer;
        }
    }
}
