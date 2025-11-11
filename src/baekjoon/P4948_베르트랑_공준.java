package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4948_베르트랑_공준 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0) {
				break;
			}

			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (isPrime(i)) {
					count++;
				}
			}

			System.out.println(count);
		}
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
