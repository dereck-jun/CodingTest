package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9506_약수들의_합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int input = Integer.parseInt(br.readLine());

			if (input == -1) {
				break;
			}

			StringBuilder sb = new StringBuilder(input + " = 1");

			int sum = 1;
			for (int i = 2; i < input; i++) {
				if (input % i == 0) {
					sum += i;
					sb.append(" + ").append(i);
				}
			}

			if (input == sum) {
				System.out.println(sb);
			} else {
				System.out.println(input + " is NOT perfect.");
			}
		}
	}
}
