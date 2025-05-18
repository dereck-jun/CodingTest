package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2438_별_찍기_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String star = "";

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			star = "*".repeat(i);
			bw.write(star);
			bw.newLine();
		}
		bw.flush();
	}
}
