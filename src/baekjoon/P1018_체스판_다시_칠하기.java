package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018_체스판_다시_칠하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int y = Integer.parseInt(st.nextToken()); // 세로
		int x = Integer.parseInt(st.nextToken()); // 가로

		char[][] arr = new char[y][x];
		for (int i = 0; i < y; i++) {
			String input = br.readLine();
			for (int j = 0; j < x; j++) {
				arr[i][j] = input.charAt(j);
			}
		}

		int count = Integer.MAX_VALUE;

		for (int i = 0; i <= y - 8; i++) {
			for (int j = 0; j <= x - 8; j++) {
				int countW = 0;
				int countB = 0;

				for (int k = 0; k < 8; k++) {
					for (int l = 0; l < 8; l++) {
						char current = arr[i + k][j + l];

						if ((k + l) % 2 == 0) {
							if (current != 'W') {
								countW++;
							}
							if (current != 'B') {
								countB++;
							}
						} else {
							if (current != 'W') {
								countW++;
							}
							if (current != 'B') {
								countB++;
							}
						}
					}
				}
				count = Math.min(count, Math.min(countW, countB));
			}
		}
		System.out.println(count);
	}
}
