package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4134_다음_소수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		int t = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < t; i++) {
			long a = Long.parseLong(br.readLine().trim());
			out.append(nextPrime(a)).append('\n');
		}
		System.out.print(out);
	}

	private static boolean isPrime(long x) {
		if (x < 2) {
			return false;
		}
		if (x == 2) {
			return true;
		}
		if (x % 2 == 0) {
			return false;
		}
		for (long i = 3; i * i <= x; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static long nextPrime(long a) {
		if (a <= 2) {
			return 2;
		}
		long n = (a % 2 == 0) ? a + 1 : a; // 홀수로 맞추기 (a가 소수일 수도 있음)
		while (!isPrime(n)) {
			n += 2; // 홀수만 검사
		}
		return n;
	}
}
