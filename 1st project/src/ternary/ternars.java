package ternary;
import java.util.Scanner;
public class ternars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a,b,c;
		Scanner sc = new Scanner(System.in);
		 a = sc.nextLine();
		 Scanner sce = new Scanner(System.in);
		 b = sce.nextLine();
		 Scanner scr = new Scanner(System.in);
		 c = scr.nextLine();
		 
		 
		if (a.equals("ample"))
		{
			if(b.equals("pample"))
			{
				System.out.println( ""+a); 
				
			} else
			{
				System.out.println(""+b);
			}    
				
		}else
		if(c.equals("sample")) {
			System.out.println(""+c);
		}
		else {
			System.out.println("");
		}
		
		
		
		
		
		
		
		}
	}


