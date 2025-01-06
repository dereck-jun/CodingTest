package programmers;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{2, 1, 2, 1});
        for (int num : result) {
            System.out.println(num);
        }
    }

    static class Solution {
        public int[] solution(int[] arr) {
            int[] answer = new int[arr.length - 1];
            if (arr.length == 1) {
                return new int[]{-1};
            }

            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }

            int idx = 0;
            for (int j : arr) {
                if (j == min) {
                    continue;
                }
                answer[idx++] = j;
            }
            return answer;
        }
    }
}
