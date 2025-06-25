package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10811_바구니_뒤집기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken());
		int loop = Integer.parseInt(st.nextToken());

		int[] arr = new int[size];
		for (int i = 0; i < size; i++){
			arr[i] = i + 1;
		}

		for (int i = 0; i < loop; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;

			while (start < end) {
				int tmp = arr[start];
				arr[start] = arr[end];
				arr[end] = tmp;
				start++;
				end--;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(arr[i]).append(" ");
		}
		bw.write(sb.toString());
		bw.flush();

		bw.close();
		br.close();
	}
}
