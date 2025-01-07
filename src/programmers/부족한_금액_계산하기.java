package programmers;

public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(3, 20, 4);
        System.out.println(result);
    }

    static class Solution {
        public long solution(int price, int money, int count) {
            for (int i = 1; i <= count ; i++) {
                money -= (price * i);
            }
            if (money >= 0) {
                return 0;
            }
            return -money;

            // count 값이 일정하게 증가 -> 등차수열의 합 공식(n * (n + 1) / 2)을 사용
            // return Math.max(price * (count * (count + 1)) / 2 - money, 0);
        }
    }
}
