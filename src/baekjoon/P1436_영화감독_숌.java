package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1436_영화감독_숌 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int count = 0;
		int num = 666;

		while (true) {
			if (String.valueOf(num).contains("666")) {
				count++;
				if (count == n) {
					System.out.println(num);
					break;
				}
			}
			num++;
		}
	}
}
