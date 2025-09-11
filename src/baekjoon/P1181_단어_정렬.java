package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class P1181_단어_정렬 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		set.stream()
			.sorted(Comparator.comparingInt(String::length)
				.thenComparing(Comparator.naturalOrder()))
			.forEach(System.out::println);

//		List<String> list = new ArrayList<>(set);
//
//		list.sort((a, b) -> {
//			if (a.length() == b.length()) {
//				return a.compareTo(b);
//			}
//			return a.length() - b.length();
//		});
	}
}
