package programmers;

public class 최소직사각형 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[][]{
            {60, 50}, {30, 70}, {60, 30}, {80, 40}
        });
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[][] sizes) {
            // min과 max를 적절하게 사용하도록 바꿀 수 있음
            int w = 0;
            int h = 0;
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] < sizes[i][1]) {
                    int tmp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = tmp;
                }
                w = Math.max(sizes[i][0], w);
                h = Math.max(sizes[i][1], h);
            }
            return w * h;
        }
    }
}
