package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1316_그룹_단어_체커 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i < loop; i++) {
			String input = br.readLine();
			String[] arr = input.split("");
			boolean flag = true;

			for (int j = 0; j < arr.length; j++) {
				if (input.lastIndexOf(arr[j]) != j && !arr[j].equals(arr[j + 1])) {
					flag = false;
				}
			}

			if (flag) {
				count++;
			}
		}

		System.out.println(count);
	}

}
