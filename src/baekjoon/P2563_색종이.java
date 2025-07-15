package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563_색종이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int quantity = Integer.parseInt(br.readLine());
		boolean[][] paper = new boolean[100][100];

		for (int i = 0; i < quantity; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());

			for (int j = startY; j < startY + 10; j++) {
				for (int k = startX; k < startX + 10; k++) {
					paper[j][k] = true;
				}
			}
		}

		int count = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (paper[i][j]) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
