package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10869_사칙연산 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.append(String.valueOf(a + b)).append("\n").flush();
		bw.append(String.valueOf(a - b)).append("\n").flush();
		bw.append(String.valueOf(a * b)).append("\n").flush();
		bw.append(String.valueOf(a / b)).append("\n").flush();
		bw.append(String.valueOf(a % b)).append("\n").flush();
	}
}
