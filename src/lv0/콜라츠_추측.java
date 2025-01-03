package lv0;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(16);
        System.out.println(result);
    }

    static class Solution {
        public int solution(long num) {
            int count = 0;
            while (num != 1 && count <= 500) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                count++;
            }
            if (count >= 500) {
                count = -1;
            }
            return count;
        }
    }
}
