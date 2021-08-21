package switchd;

import java.util.Scanner;

public class switchd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter first number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println("enter second number");

		int y = sc.nextInt();

		System.out.println("enter operater");
		// string does not store operaters
		sc.nextLine();
		char k = sc.nextLine().charAt(0);
		int z = 0;
		if (k == '+') {
			z = x + y;

		}
		if (k == '-') {
			z = x - y;

		}
		if (k == '*') {
			z = x * y;

		}
		if (k == '/') {
			z = x / y;
		}
		System.out.println(z);

	}

}
