package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P25304_영수증 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;

		int totalPrice = Integer.parseInt(br.readLine());
		int items = Integer.parseInt(br.readLine());

		for (int i = 0; i < items; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int stock = Integer.parseInt(st.nextToken());

			sum = sum + (price * stock);
		}

		if (totalPrice != sum) {
			bw.append("No").flush();
			return;
		}
		bw.append("Yes").flush();
	}
}
