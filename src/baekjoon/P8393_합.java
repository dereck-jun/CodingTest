package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P8393_합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long sum = 0;
		int n = Integer.parseInt(br.readLine());

		while (n > 0) {
			sum += n;
			n -= 1;
		}
		bw.write(String.valueOf(sum));
		bw.flush();
	}
}
