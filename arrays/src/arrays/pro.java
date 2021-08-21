package arrays;

import java.util.Scanner;

public class pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
	int j[]= new int[n] ;
	for( int i=0;i<n;i++) {
		 j[i] = sc.nextInt();

			
	}
		
		for( int i=0;i<n;i++) {
			
			System.out.println("no.s"+i+"with marks"+j[i]);
			
		}
		for( int i=0;i<n;i++) {
			
		
		k=j[i]+k;
		}
		k=k/n;
		System.out.println(k);
	}

}
