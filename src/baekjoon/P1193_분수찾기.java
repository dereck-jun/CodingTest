package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193_분수찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());

		int line = 1;
		int sum = 0;

		while (sum + line < X) {
			sum += line;
			line++;
		}

		int indexInLine = X - sum;

		int numerator;
		int denominator;

		if (line % 2 == 0) {
			numerator = indexInLine;
			denominator = line - indexInLine + 1;
		} else {
			numerator = line - indexInLine + 1;
			denominator = indexInLine;
		}

		System.out.println(numerator + "/" + denominator);
	}

}
