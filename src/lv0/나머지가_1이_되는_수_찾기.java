package lv0;

public class 나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(12);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 3; i < n; i++) {
                if (n % i == 1) {
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
