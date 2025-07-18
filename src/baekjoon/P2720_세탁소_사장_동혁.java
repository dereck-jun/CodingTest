package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2720_세탁소_사장_동혁 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int[] cents = new int[4];
			int change = Integer.parseInt(br.readLine());

			while (change > 0) {
				if (25 <= change) {
					cents[0] = change / 25;
					change %= 25;
				} else if (10 <= change) {
					cents[1] = change / 10;
					change %= 10;
				} else if (5 <= change) {
					cents[2] = change / 5;
					change %= 5;
				} else if (1 <= change) {
					cents[3] = change / 1;
					change %= 1;
				}
			}

			for (int j = 0; j < cents.length; j++) {
				System.out.print(cents[j] + " ");
			}
		}
	}
}
