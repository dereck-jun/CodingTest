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
            Map<Character, Integer> map = new HashMap<>();
            char[] charArray = s.toCharArray();
            int[] answer = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                if (!map.containsKey(charArray[i])) {
                    map.put(charArray[i], i);
                    answer[i] = -1;
                } else {
                    answer[i] = i - map.get(charArray[i]);
                    map.put(charArray[i], i);
                }
            }
            return answer;
        }
    }
}
