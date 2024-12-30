package lv0;

public class 평균_구하기 {
    public static void main(String[] args) {
        int[] arr = {5, 5};
        Solution solution = new Solution();
        double result = solution.solution(arr);
        System.out.println(result);
    }

    static class Solution {
        int answer = 0;

        public double solution(int[] arr) {

            if (arr == null || arr.length == 0) {
                return 0;
            }

            for (int num : arr) {
                answer += num;
            }

            return (double) answer / arr.length;
        }
    }

}
