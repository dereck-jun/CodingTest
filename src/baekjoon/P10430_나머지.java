package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10430_나머지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int result1 = (A + B) % C;
		int result2 = ((A % C) + (B % C)) % C;
		int result3 = (A * B) % C;
		int result4 = ((A % C) * (B % C)) % C;

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.append(String.valueOf(result1)).append("\n").flush();
		bw.append(String.valueOf(result2)).append("\n").flush();
		bw.append(String.valueOf(result3)).append("\n").flush();
		bw.append(String.valueOf(result4)).flush();
	}
}
