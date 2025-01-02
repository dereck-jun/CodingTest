package lv0;

public class 문자열을_정수로_바꾸기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("-1234");
        System.out.println(result);
    }

    static class Solution {
        public int solution(String s) {
            return Integer.parseInt(s);
        }
    }
}
