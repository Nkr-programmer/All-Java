package gfgfasinatig;
import java.util.Scanner;
public class Fsinating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t>0) {
			int k=0,l=0;
		//	n=sc.nextInt();
			boolean x=true;
			int a=sc.nextInt();
			k=a*2;
			l=a*3;
			 String r=String.valueOf(k);
			 String s=String.valueOf(l);
			 String p=String.valueOf(a);
			 String m= p.concat(r.concat(s));
			 int b[]=new int[m.length()];
			 for(int i=0;i<m.length();)
			 {
				 b[i++]=a%10;
				 a=a/10;
				 b[i++]=k%10;
				 k=k/10;
				 b[i++]=l%10;
				 l=l/10;
				 
			 }
			// System.out.println(m+" "+m.length());
//			 for(int i=0;i<=m.length();i++)
//			 {
//				 System.out.println(b[i]);
//				 
//				 
//			 }
			 for(int z=0;z<9;z++)
			    {
				 for(int j=0;j<9;j++)
				    {
					 if(b[j]==z)
					     {
						 x=true;
						 break;
					      }
					 else {
						 x=false;
						 
					      }
				     }
	     	 }
			if(x==true)
			{
				
				System.out.println("1");
			}
			else 
				if(x==false)
			{
				System.out.println("0");
				
			}
			
			System.out.println();
			t--;
			
			
		}
		
		
		
		
		
	}

}
