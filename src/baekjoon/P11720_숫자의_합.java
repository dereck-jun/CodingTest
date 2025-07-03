package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11720_숫자의_합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long N = Long.parseLong(br.readLine());

		String input = sb.append(br.readLine()).toString();

		if (N != input.length()) {
			throw new RuntimeException("길이가 다름");
		}

		String[] arr = input.split("");
		int sum = 0;
		for (String s : arr) {
			int num = Integer.parseInt(s);
			sum += num;
		}

		System.out.println(sum);
	}

}
