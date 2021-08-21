package gfgbasic;

import java.util.Scanner;

public class Perfect_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t;
		Scanner sc = new Scanner(System.in);

		t = sc.nextInt();

		while (t > 0) {

			int n, l, k = 0, h = 0, g = 0,o=0,inc=0;
			boolean x = false;

			n = sc.nextInt();

			
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();

			}

			for (int i = 0; i < n; i++) {
				k = 0;
				g = 0;
				for (int j = 0; j < n-1; j++) {

					if (a[i] == a[j]) {
						if(a[j]==a[j+1])
						{k = j;
						g++;
						}
					}

				}
				if (g >= 1) {
					inc++;
					if(inc>1) {x=false;break;}
					else {g++;}
				} 
				

			}

			for (int y = 0; y < n; y++) {
				if ((y < k) && (a[y] < a[y + 1]) && (a[y] != a[y + 1])) {
					x = true;
				} else {
					x = false;
					break;
				}

				if ((y >= k) && (y <= k + g)) {
					if (a[k] == a[y]) {
						x = true;
					}

					else {
						x = false;
						break;
					}
				}

				if ((y >= k + g) && (a[y] > a[y + 1]) && (a[y] != a[y + 1])&&(inc==1)) {
					x = true;
				} else {
					x = false;
					break;
				}

			}

			if( (x = true)) {
				System.out.print("Yes");
			} else 
			{
				System.out.print("No");
			}
			t--;
		}
	}

}
