package lv0;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result1 = solution.solution("01033334444");
        String result2 = solution.solution("027778888");
        System.out.println(result1);
        System.out.println(result2);
    }

    static class Solution {
        public String solution(String phone_number) {
            return "*".repeat(phone_number.length() - 4) + phone_number.substring((phone_number.length() - 4));

/*
            char[] ch = phone_number.toCharArray();
            for (int i = 0; i < phone_number.length() - 4; i++) {
                ch[i] = '*';
            }
            return String.valueOf(ch);
*/
        }
    }
}
