package programmers;

public class 음양_더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i]) {
                    answer += absolutes[i];
                } else {
                    answer -= absolutes[i];
                }
            }
            return answer;
        }
    }
}
