package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978_소수_찾기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;

		for (int i = 0; i < input; i++) {
			int num = Integer.parseInt(st.nextToken());
			boolean flag = false;

			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag && num != 1) {
				count++;
			}
		}

		System.out.println(count);
	}

}
