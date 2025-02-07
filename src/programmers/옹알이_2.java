package programmers;

public class 옹알이_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new String[]{"ayayeayaaya"});
        System.out.println("result = " + result);
    }

    static class Solution {
        public int solution(String[] babbling) {
            int count = 0;
            for (String str : babbling) {
                String previous = "";
                while (!str.isEmpty()) {
                    if (str.startsWith("aya") && !"aya".equals(previous)) {
                        str = str.substring("aya".length());
                        previous = "aya";
                        continue;
                    }
                    if (str.startsWith("ye") && !"ye".equals(previous)) {
                        str = str.substring("ye".length());
                        previous = "ye";
                        continue;
                    }
                    if (str.startsWith("woo") && !"woo".equals(previous)) {
                        str = str.substring("woo".length());
                        previous = "woo";
                        continue;
                    }
                    if (str.startsWith("ma") && !"ma".equals(previous)) {
                        str = str.substring("ma".length());
                        previous = "ma";
                        continue;
                    }
                    break;
                }
                if (str.isEmpty()) count++;
            }
            return count;
        }
    }
}
