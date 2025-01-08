package programmers;

public class 삼진법_뒤집기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(125);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int n) {
            // Integer.parseInt()는 특정 진법 문자열을 10진수로 변환할 수 있다.
            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                sb.append(n % 3);
                n /= 3;
            }
            return Integer.parseInt(sb.toString(), 3);

//            String str = Integer.toString(n, 3);
//            return Integer.parseInt(new StringBuilder(str).reverse().toString(), 3);
        }
    }
}
