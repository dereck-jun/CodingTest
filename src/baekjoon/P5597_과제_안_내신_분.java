package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P5597_과제_안_내신_분 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			boolean[] submitted = new boolean[31];

			for (int i = 0; i < 28; i++) {
				int num = Integer.parseInt(br.readLine());
				submitted[num] = true;
			}

			for (int i = 1; i <= 30; i++) {
				if (!submitted[i]) {
					bw.write(i + "\n");
				}
			}

			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
