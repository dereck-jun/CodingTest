package programmers;

public class 소수_만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] nums) {
            int count = 0;

            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        int sum = nums[i] + nums[j] + nums[k];

                        if (isPrime(sum)) {
                            count++;
                        }
                    }
                }
            }
            return count;
        }

        private boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }
}
