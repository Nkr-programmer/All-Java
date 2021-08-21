package binaryanddecimal;

import java.util.HashSet;
import java.util.Scanner;

public class Cn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		
		HashSet<String>p= new HashSet<String>();
		HashSet<String>k= new HashSet<String>();
		HashSet<String>h= new HashSet<String>();
		HashSet<String>t= new HashSet<String>();
		boolean d=false;
		for(int i=0;i<x.length();i=i+3)
		{
			String a=x.substring(i+1,i+3 );
			if(x.charAt(i)=='P')
			{
				if(p.contains(a)) {System.out.println("ERROR");d= true;break;}
				else {p.add(a);}
			}
			else 
				if(x.charAt(i)=='K')
			{
					if(k.contains(a)) {System.out.println("ERROR");d= true;break;}
					else {k.add(a);}
			}
				else
					if(x.charAt(i)=='H')
					{
						if(h.contains(a)) {System.out.println("ERROR");d= true;break;}
						else {h.add(a);}
					}
					else
						if(x.charAt(i)=='T')
						{
							if(t.contains(a)) {System.out.println("ERROR");d= true;break;}
							else {t.add(a);}
						}
			
		}
		if(!d)
		System.out.println(13-p.size()+" "+(13-k.size())+" "+(13-h.size())+" "+(13-t.size())+" ");
	}

}
