package programmers;

import java.time.LocalDate;

public class _2016년 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution(5, 24);
        System.out.println(solution1);
    }

    static class Solution {
        public String solution(int a, int b) {
            LocalDate localDate = LocalDate.of(2016, a, b);
            return localDate.getDayOfWeek().toString().substring(0, 3);

//            라이브러리 없이 사용할 수 있는 코드
//            String answer = "";
//            String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };   // 시작이 금요일이라고 정해져 있음
//            int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };      // 윤년
//            int allDate = 0;
//            for (int i = 0; i < a - 1; i++) {     // 구하려고 하는 날짜의 이전 월의 일 수를 더함
//                allDate += date[i];
//            }
//            allDate += (b - 1);       // 당월의 일 수 - 1을 더함 (-1을 안하면 하루 지난 것으로 계산하기 때문)
//            answer = day[allDate % 7];
//
//            return answer;
        }
    }
}
