package programmers;

import java.util.HashMap;
import java.util.Map;

public class 가장_가까운_글자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution("foobar");
        for (int i : result) {
            System.out.println("i = " + i);
        }

    }

    static class Solution {
        public int[] solution(String s) {
            // 최근 위치를 저장하기 위해 Map 사용
            // 가까운 위치에 대한 정보를 업데이트 하기 위해 answer 배열에 값을 넣고, Map value를 업데이트 함
            // getOrDefault로 if 문을 없앨 수 있음
            Map<Character, Integer> map = new HashMap<>();
            int[] answer = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                answer[i] = i - map.getOrDefault(c, i + 1);
                map.put(c, i);
            }
            return answer;
        }
    }
}
