package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9086_문자열 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());

		for (int i = 0; i < loop; i++) {
			String input = br.readLine();
			int length = input.length();

			if (length == 1) {
				System.out.println(String.valueOf(input.charAt(0)) + input.charAt(0));
			} else {
				System.out.println(String.valueOf(input.charAt(0)) + input.charAt(length - 1));
			}
		}
	}
}
