package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2581_소수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = Integer.MAX_VALUE;

		for (int i = M; i <= N; i++) {
			if (isPrime(i)) {
				sum += i;
				min = Math.min(min, i);
			}
		}

		if (sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
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
