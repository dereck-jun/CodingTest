package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9996_한국이_그리울_땐_서버에_접속하지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();

		int starIndex = input.indexOf("*");
		String prefix = input.substring(0, starIndex);
		String suffix = input.substring(starIndex + 1);

		for (int i = 0; i < N; i++) {
			String str = br.readLine();

			if (str.length() < prefix.length() + suffix.length()) {
				System.out.println("NE");
				continue;
			}

			if (str.startsWith(prefix) && str.endsWith(suffix)) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
	}

}
