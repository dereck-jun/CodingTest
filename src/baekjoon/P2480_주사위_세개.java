package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2480_주사위_세개 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int firstDice = Integer.parseInt(st.nextToken());
		int secondDice = Integer.parseInt(st.nextToken());
		int thirdDice = Integer.parseInt(st.nextToken());
		int result = 0;

		if (firstDice == secondDice && secondDice == thirdDice) {
			result = 10000 + (firstDice * 1000);
		} else if (firstDice == secondDice || firstDice == thirdDice) {
			result = 1000 + (firstDice * 100);
		} else if (secondDice == thirdDice) {
			result = 1000 + (secondDice * 100);
		} else {
			result = Math.max(firstDice, Math.max(secondDice, thirdDice)) * 100;
		}

		bw.write(String.valueOf(result));
		bw.flush();
	}
}
