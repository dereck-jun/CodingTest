package programmers;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result1 = solution.solution(3);
        String result2 = solution.solution(4);
        System.out.println(result1);
        System.out.println(result2);
    }

    static class Solution {
        public String solution(int n) {
            String str = "수박";
            if (n % 2 == 0) {
                return str.repeat(n / 2);
            } else {
                return str.repeat(n / 2) + "수";
            }
        }
    }
}
