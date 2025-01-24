package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 카드_뭉치 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(result);
    }

    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            Queue<String> cardQueue1 = new LinkedList<>(Arrays.asList(cards1));
            Queue<String> cardQueue2 = new LinkedList<>(Arrays.asList(cards2));

            for (String str : goal) {
                if (str.equals(cardQueue1.peek())) {
                    cardQueue1.poll();
                } else if (str.equals(cardQueue2.peek())) {
                    cardQueue2.poll();
                } else {
                    return "No";
                }
            }
            return "Yes";
        }
    }
}
