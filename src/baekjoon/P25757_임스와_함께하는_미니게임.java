package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P25757_임스와_함께하는_미니게임 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<String> set = new HashSet<>();

		int N = Integer.parseInt(st.nextToken());
		String game = st.nextToken();

		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		if (game.equalsIgnoreCase("Y")) {
			System.out.println(set.size());
		} else if (game.equalsIgnoreCase("F")) {
			System.out.println(set.size() / 2);
		} else {
			System.out.println(set.size() / 3);
		}
	}
}
