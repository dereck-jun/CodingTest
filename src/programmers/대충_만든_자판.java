package programmers;

import java.util.HashMap;
import java.util.Map;

public class 대충_만든_자판 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"DG"});
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    static class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];

            // map을 2개 만들어서 각 자판 누름 횟수에 따라서 돌리려고 함
            // -> 하나만 만들되, alphabet을 key로 둬서 중복이 발생했을 때 자판 누름 횟수가 더 적을 경우 바꿔지게 변경
            Map<Character, Integer> minPress = new HashMap<>();
            for (String key : keymap) {
                for (int i = 0; i < key.length(); i++) {
                    char ch = key.charAt(i);
                    int presses = i + 1;
                    if (!minPress.containsKey(ch) || presses < minPress.get(ch)) {  // 아직 등록이 안되었거나 누름 횟수가 더 적으면 추가(또는 변경)
                        minPress.put(ch, presses);
                    }
                }
            }

            for (int i = 0; i < targets.length; i++) {
                int count = 0;
                char[] charArray = targets[i].toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    if (!minPress.containsKey(charArray[j])) {
                        answer[i] = -1;
                        count = 0;
                        break;
                    }
                    count += minPress.get(charArray[j]);
                }
                if (count != 0) {
                    answer[i] = count;
                }
            }

            return answer;
        }
    }
}
