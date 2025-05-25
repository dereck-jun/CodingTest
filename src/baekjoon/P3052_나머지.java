package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class P3052_나머지 {

	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			int[] arr = new int[10];
			for (int i = 0; i < 9; i++) {
				int num = Integer.parseInt(br.readLine()) % 42;
				arr[i] = num;
			}

			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < 10; i++) {
				set.add(arr[i]);
			}

			int size = set.size();
			bw.write(String.valueOf(size));
			bw.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
