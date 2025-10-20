package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1735_분수_합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());

		// 통분: LCM = b1 * b2 / gcd(b1, b2)
		int lcm = b1 / gcd(b1, b2) * b2;         // overflow 최소화 순서
		int nume = a1 * (lcm / b1) + a2 * (lcm / b2);

		int[] reduced = reduceFraction(nume, lcm);
		System.out.println(reduced[0] + " " + reduced[1]);
	}

	// 최대공약수 (유클리드 호제법)
	private static int gcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (b != 0) {
			int t = a % b;
			a = b;
			b = t;
		}
		return a;
	}

	// 기약분수로 약분 + 분모 정규화(항상 분모 ≥ 0)
	private static int[] reduceFraction(int num, int den) {
		if (den == 0) {
			throw new ArithmeticException("분모가 0입니다.");
		}
		int g = gcd(num, den);
		num /= g;
		den /= g;
		if (den < 0) {            // 분모가 음수면 부호를 위로 올림
			num = -num;
			den = -den;
		}
		return new int[]{num, den};
	}

}
