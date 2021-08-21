package ternary;

import java.util.Scanner;

public class ternis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a,b,c ,result,j;
		Scanner sc = new Scanner(System.in);
		 a = sc.nextLine();
		 Scanner sce = new Scanner(System.in);
		 b = sce.nextLine();
		 Scanner scr = new Scanner(System.in);
		 c = scr.nextLine();
		 
		result= (a.equals("ample"))?(b.equals("pample")) ?a:b: (c.equals("sample")) ?b:c;
		System.out.println(result);
	}

}
