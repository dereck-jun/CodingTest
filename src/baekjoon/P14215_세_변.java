package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14215_세_변 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int max = Math.max(a, Math.max(b, c));
		int sum = a + b + c;

		if (sum - max <= max) {
			int temp = sum;
			sum -= max;
			max = temp - max - 1;

			System.out.println(sum + max);
		} else {
			System.out.println(sum);
		}
	}

}
