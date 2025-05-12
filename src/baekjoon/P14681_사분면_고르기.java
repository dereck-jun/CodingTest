package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P14681_사분면_고르기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if (x > 0 && y > 0) {
			bw.append("1").flush();
		} else if (x < 0 && y > 0) {
			bw.append("2").flush();
		} else if (x < 0 && y < 0) {
			bw.append("3").flush();
		} else {
			bw.append("4").flush();
		}

	}
}
