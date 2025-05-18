package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10951_A_더하기_B_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;

		while ((input = br.readLine()) != null) {
			if (input.trim().isEmpty()) {
				continue;
			}

			String[] tokens = input.split(" ");
			int A = Integer.parseInt(tokens[0]);
			int B = Integer.parseInt(tokens[1]);

			bw.write(String.valueOf(A + B));
			bw.newLine();
		}
		bw.flush();
	}
}
