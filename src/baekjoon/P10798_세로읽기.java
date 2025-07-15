package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798_세로읽기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] arr = new String[5][15];

		// 배열에 input 저장
		for (int i = 0; i < 5; i++) {
			String[] input = br.readLine().split("");

			for (int j = 0; j < input.length; j++) {
				arr[i][j] = input[j];
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] != null) {
					System.out.print(arr[j][i]);
				}
			}
		}
	}

}
