package switchd;

import java.util.Scanner;

public class switcher {

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
		switch (k) {
		case '+':
			z = x + y;

			break;
		case '-':
			z = x - y;

			break;
		case '*':
			z = x * y;

			break;
		case '/':
		case '^':
			z = x / y;

			break;

		default:
			System.out.println("chal bye");

		}
		System.out.println(z);

	}

}
