package lv0;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"Jane", "Kim", "Park", "Lee", "Charlie"});
        System.out.println(result);
    }

    static class Solution {
        public String solution(String[] seoul) {
            String answer = "";
            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    answer = "김서방은 " + i + "에 있다";
                    break;
                }
            }
            return answer;

            // indexOf 사용하면 됨
            // int x = Arrays.asList(seoul).indexOf("Kim");
            // return "김서방은 " + x + "에 있다";
        }
    }
}
