package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4963_섬의_개수 {

	static int w, h;
	static int[][] graph;
	static boolean[][] isVisited;
	static int count;
	static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
	static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			if (w == 0 && h == 0) {
				break;
			}

			graph = new int[h][w];
			isVisited = new boolean[h][w];

			count = 0;

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					graph[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (graph[i][j] == 1 && !isVisited[i][j]) {
						dfs(j, i);
						count++;
					}
				}
			}

			System.out.println(count);
		}
	}

	static void dfs(int x, int y) {
		isVisited[y][x] = true;

		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < w && ny < h) {
				if (graph[ny][nx] == 1 && !isVisited[ny][nx]) {
					dfs(nx, ny);
				}
			}
		}
	}

}
