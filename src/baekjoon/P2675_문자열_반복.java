package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2675_문자열_반복 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		int loop = Integer.parseInt(br.readLine());

		for (int i = 0; i < loop; i++) {
			StringBuilder sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int repeat = Integer.parseInt(st.nextToken());
			String input = st.nextToken();
			String[] arr = input.split("");

			for (int j = 0; j < arr.length; j++) {
				sb.append(arr[j].repeat(repeat));
			}

			bw.write(sb.toString());
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
