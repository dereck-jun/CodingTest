package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13241_최소공배수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		System.out.println((a * b) / gcd(a, b));
	}

	private static long gcd(long a, long b) {
		if (a % b != 0) {
			return gcd(b, a % b);
		}
		return b;
	}
}
