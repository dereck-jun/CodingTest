package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2588_곱셈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		char[] charArray = String.valueOf(b).toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			bw.append(String.valueOf(a * Character.getNumericValue(charArray[i]))).append("\n").flush();
		}
		
		bw.append(String.valueOf(a * b)).flush();
	}

}
