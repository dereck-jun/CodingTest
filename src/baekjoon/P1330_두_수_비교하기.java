package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1330_두_수_비교하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		if (A > B) {
			bw.append(">").flush();
		} else if (A < B) {
			bw.append("<").flush();
		} else {
			bw.append("==").flush();
		}
	}
}
