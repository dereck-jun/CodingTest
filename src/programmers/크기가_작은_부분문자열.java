package programmers;

public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("10203", "15");
        System.out.println(result);
    }

    static class Solution {
        public int solution(String t, String p) {
            // 1. p의 길이만큼 여러 번 자른다.
            // 2. 자른 문자열과 p의 길이를 비교한다.
            // 3. p보다 작거나 같은 수의 개수 리턴
            int count = 0;
            long pLongVal = Long.parseLong(p);
            for (int i = 0; i <= t.length() - p.length(); i++) {
                long tLongVal = Long.parseLong(t.substring(i, p.length() + i));
                if (tLongVal <= pLongVal) {
                    count += 1;
                }
            }
            return count;
        }
    }
}
