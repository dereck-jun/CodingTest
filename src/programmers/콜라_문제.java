package programmers;

public class 콜라_문제 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(3, 2, 20);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            while (n != 1 && n > 0) {
                if (n < a) break;
                int i = (n / a) * b;
                if (n % a != 0) {
                    int remain = n % a;
                    answer += i;
                    n = i + remain;
                } else {
                    answer += i;
                    n = i;
                }
            }
            return answer;
//            무한 등비 급수를 이용한 풀이
//            n(가지고 있는 병의 개수) - a(교환에 필요한 병의 개수) + b(교환으로 얻은 병의 개수) => n < a 가 될 때까지 반복
//            n - (a - b) * (r - 1) >= a => r = (n - b) / (a - b) * b
//            return (n - b) / (a - b) * b;
        }
    }
}
