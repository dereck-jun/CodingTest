package programmers;

public class 행렬의_덧셈 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] result = solution.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}});
    }

    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            // 행렬의 덧셈은 두 행렬의 같은 위치에 있는 값을 더하는 것
            // 두 행렬의 크기가 동일함
            // 결과 행렬의 크기는 입력 행렬과 동일함
            // 행렬의 최대 크기가 작기 때문에 이중 반복문으로도 충분히 효율적으로 해결 가능
            int[][] result = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    result[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return result;
        }
    }
}
