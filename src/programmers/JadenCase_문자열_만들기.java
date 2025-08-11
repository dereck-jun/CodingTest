package programmers;

public class JadenCase_문자열_만들기 {

	public static void main(String[] args) {
		System.out.println(solution(" hello  world "));
	}

	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		boolean isFirstWord = true;

		for (char c : s.toCharArray()) {
			if (isFirstWord) {
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(Character.toLowerCase(c));
			}

			isFirstWord = (c == ' ');
		}

		return sb.toString();
	}
}
