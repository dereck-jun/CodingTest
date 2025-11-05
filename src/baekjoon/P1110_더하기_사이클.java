package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1110_더하기_사이클 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int n = start;
		int count = 1;

		while (true) {
			int rnum = n % 10; // 일의 자리
			int div = n / 10;  // 십의 자리

			StringBuilder sb = new StringBuilder();
			int num = Integer.parseInt(sb.append(rnum).append((rnum + div) % 10).toString());

			if (start == num) {
				break;
			}

			count++;
			n = num;
		}

		System.out.println(count);
	}
}
