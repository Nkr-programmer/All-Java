package power;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, k = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("print the superscript:");
		int n = sc.nextInt();
		System.out.println("print the number:");
		int j = sc.nextInt();
		for (i = 1; i <= n; i++) {

			k = k * j;
			System.out.print(j + " * ");
		}

		System.out.println("" + k);
	}

}
