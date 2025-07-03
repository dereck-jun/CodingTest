package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5622_다이얼 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int total = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c >= 'A' && c <= 'C') {
				total += 3;
			} else if (c <= 'F') {
				total += 4;
			} else if (c <= 'I') {
				total += 5;
			} else if (c <= 'L') {
				total += 6;
			} else if (c <= 'O') {
				total += 7;
			} else if (c <= 'S') {
				total += 8;
			} else if (c <= 'V') {
				total += 9;
			} else if (c <= 'Z') {
				total += 10;
			}
		}

		System.out.println(total);
	}

}
