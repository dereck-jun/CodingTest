package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2525_오븐_시계 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		int addHour = (minute + time) / 60;

		if (addHour > 0) {
			if (hour + addHour > 23) {
				hour = hour + addHour - 24;
			} else {
				hour += addHour;
			}
			minute += (time - (60 * addHour));
		} else {
			minute += time;
		}
		bw.write(hour + " " + minute);
		bw.flush();
	}
}
