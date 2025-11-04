package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2577_숫자의_개수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		String mul = String.valueOf(a * b * c);
		char[] arr = mul.toCharArray();

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (char ch : arr) {
				if (i == Character.getNumericValue(ch)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
