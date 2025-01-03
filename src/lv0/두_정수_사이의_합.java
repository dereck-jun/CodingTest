package lv0;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(3, 3);
        System.out.println(result);
    }

    static class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            if (a > b) {
                for (int i = b; i <= a; i++) {
                    answer += i;
                }
            } else {
                for (int i = a; i <= b; i++) {
                    answer += i;
                }
            }
            return answer;
            
            // 등차수열의 합 공식을 사용해서 해결할 수 있음
//            long min = Math.min(a, b);
//            long max = Math.max(a, b);
//
//            return (max - min + 1) * (max + min) / 2;
        }
    }
}
