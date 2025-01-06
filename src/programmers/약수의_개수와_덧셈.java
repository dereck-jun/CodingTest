package programmers;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(13, 17);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int left, int right) {
            int result = 0;
            for (int i = left; i <= right; i++) {
                int count = 0;
                for (int j = 1; j * j <= i; j++) {
                    if (j * j == i) {
                        count += 1;
                    } else if (i % j == 0) {
                        count += 2;
                    }
                }
                if (count % 2 == 0) {
                    result += i;
                } else {
                    result -= i;
                }
/*
                if (i % Math.sqrt(i) == 0) {
                    result -= i;
                } else {
                    result += i;
                }
*/
            }
            return result;
        }
    }
}
