package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class P25325_학생_인기도_측정 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(st.nextToken(), 0);
		}

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				String name = st.nextToken();
				map.put(name, map.get(name) + 1);
			}
		}

		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((a, b) -> {
			if (!a.getValue().equals(b.getValue())) {
				return b.getValue() - a.getValue();
			}

			return a.getKey().compareTo(b.getKey());
		});

		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
