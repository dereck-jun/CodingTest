package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P25314_코딩은_체육과목_입니다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int loopCount = N / 4;

		for (int i = 0; i < loopCount; i++) {
			bw.write("long ");
		}
		bw.write("int");
		bw.flush();
	}
}
