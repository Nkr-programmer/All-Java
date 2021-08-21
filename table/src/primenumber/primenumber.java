package primenumber;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="its aprime number";
		float k;
		
		Scanner sc = new Scanner(System.in);
		float x = sc.nextInt();
		for(float i=2;i<x;i++)
		{
			if(x%i==0)
			{
				a="its  not aprime number";
			break;	
			}
			
			
			
			
		}
		System.out.println(""+a);
	
		
		
		
		for(float i=2;i<x;i++)
		{
		
		
		if(x%i==0)
		{
		System.out.print(i);
		
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}