package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P10809_알파벳_찾기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		for (int i = 97; i < 123; i++) {
			String alphabet = Character.toString((char) i);
			map.put(alphabet, -1);
		}

		String input = br.readLine();
		String[] arr = input.split("");
		for (int i = 0; i < arr.length; i++) {
			map.get(arr[i]);
			if (map.get(arr[i]) != -1) {
				continue;
			}
			map.put(arr[i], i);
		}

		map.forEach((k, v) -> System.out.print(v + " "));
	}

}
