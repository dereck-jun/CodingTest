package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2439_별_찍기_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String whiteSpace = "";
		String star = "";

		int N = Integer.parseInt(br.readLine());

		for (int i = N - 1; i >= 0; i--) {
			whiteSpace = " ".repeat(i);
			star = "*".repeat(N - i);
			bw.write(whiteSpace + star);
			bw.newLine();
		}
		bw.flush();
	}

}
