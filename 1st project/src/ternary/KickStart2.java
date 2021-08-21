package ternary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class KickStart2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int iz = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Long.parseLong(br.readLine());
		while (T > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long r = 0, c = 0;
			r = Long.parseLong(st.nextToken());
			c = Long.parseLong(st.nextToken());
			int count = 0;
			int a[][] = new int[(int) r][(int) c];
			for (int i = 0; i < r; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < c; j++) {
					a[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int s = 0;
			for (int i = 0; i < c; i++) {
				HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
				boolean x = false;
				int g = 0;
				for (int j = 0; j < r; j++) {
					if (a[j][i] == 1) {
						x = true;
					} else if (a[j][i] == 0) {

						for (Entry<Integer, Integer> z : b.entrySet()) {
							int w = 1;
							int e = z.getKey(), c1 = i;
							while (c1<c&&a[e][c1] == 1 ) {
								w++;c1++;
							}
							int w1 = w, m = z.getValue();
							if (z.getValue() > w) {
								while (z.getValue() < 2 * w) {
									w--;
								}
								s = s + w;
							} else if (z.getValue() < w) {
								while (w < 2 * m) {
									m--;
								}
								s = s + m;
							}

							int f = g-z.getValue();
							if (f > w) {
								while (f < 2 * w) {
									w--;
								}
								s = s + w;
							} else if (f < w) {
								while (w < 2 * f) {
									f--;
								}
								s = s + f;
							}

						}
g=0;
						b.clear();

						x = false;
					}

					if (x) {
						g++;
						if (i + 1 < c && a[j][i + 1] == 1) {
							b.put(j, g);
						}
						System.out.println(s+" "+i+" "+j);			
					}
				
					for (Entry<Integer, Integer> z : b.entrySet()) {
						int w = 1;
						int e = z.getKey(), c1 = i;
						while (c1 < c&&a[e][c1] == 1 ) {
							w++;c1++;
						}
						int w1 = w, m = z.getValue();
						if (z.getValue() > w) {
							while (z.getValue() < 2 * w) {
								w--;
							}
							s = s + w-1;
						} else if (z.getValue() < w) {
							while (w < 2 * m) {
								m--;
							}
							s = s + m-1;
						}

						int f = g-z.getValue();
						if (f > w) {
							while (f < 2 * w) {
								w--;
							}
							s = s + w;
						} else if (f < w) {
							while (w < 2 * f) {
								f--;
							}
							s = s + f;
						}

					}

					b.clear();

				}
			System.out.println(s+" "+i);

			}


		System.out.println("Case #"+(iz++)+": "+s);
			T--;
		}

	}

}
