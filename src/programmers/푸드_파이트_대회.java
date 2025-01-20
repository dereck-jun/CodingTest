package programmers;

public class 푸드_파이트_대회 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new int[]{1, 3, 4, 6});
        System.out.println(result);
    }

    static class Solution {
        public String solution(int[] food) {
            String answer = "";
            StringBuilder sb1 = new StringBuilder();
            for (int i = 1; i < food.length; i++) {
                int count = food[i] / 2;
                sb1.append(String.valueOf(i).repeat(count));
            }
            answer = sb1 + "0";
            return answer + sb1.reverse();
        }
    }
}
