package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P18126_너구리_구구 {

	static int N;
	static long maxDistance = Long.MIN_VALUE;
	static List<List<Node>> graph = new ArrayList<>(N + 1);

	static class Node {
		int to;
		int distance;

		Node(int to, int distance) {
			this.to = to;
			this.distance = distance;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int distance = Integer.parseInt(st.nextToken());

			graph.get(from).add(new Node(to, distance));
			graph.get(to).add(new Node(from, distance));
		}

		boolean[] isVisited = new boolean[N + 1];
		dfs(1, 0, isVisited);

		System.out.println(maxDistance);
	}

	static void dfs(int from, long distance, boolean[] isVisited) {
		isVisited[from] = true;

		maxDistance = Math.max(maxDistance, distance);

		for (Node next : graph.get(from)) {
			if (!isVisited[next.to]) {
				dfs(next.to, distance + next.distance, isVisited);
			}
		}
	}
}
