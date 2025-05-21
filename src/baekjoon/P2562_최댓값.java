package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2562_최댓값 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = -1;
		int idx = 0;

		for (int i = 1; i <= 9; i++) {
			int num = Integer.parseInt(br.readLine());
			if (max < num) {
				max = num;
				idx = i;
			}
		}

		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(idx));
		bw.flush();

		bw.close();
		br.close();
	}
}
