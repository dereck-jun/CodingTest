package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P9498_시험_성적 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());

		if (90 <= A) {
			bw.append("A").flush();
		} else if (80 <= A) {
			bw.append("B").flush();
		} else if (70 <= A) {
			bw.append("C").flush();
		} else if (60 <= A) {
			bw.append("D").flush();
		} else {
			bw.append("F").flush();
		}
	}
}
