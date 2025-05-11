package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2753_윤년 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int year = Integer.parseInt(br.readLine());

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			bw.append("1").flush();
		} else {
			bw.append("0").flush();
		}
	}
}
