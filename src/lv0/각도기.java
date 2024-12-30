package lv0;

public class 각도기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result1 = solution.solution(89);
        int result2 = solution.solution(90);
        int result3 = solution.solution(91);
        int result4 = solution.solution(180);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    static class Solution {
        public int solution(int angle) {
            return filtering(angle);
        }

        private static int filtering(int angle) {
            if (angle < 90) {
                return 1;
            } else if (angle == 90) {
                return 2;
            } else if (angle < 180) {
                return 3;
            } else {
                return 4;
            }
        }
    }
}
