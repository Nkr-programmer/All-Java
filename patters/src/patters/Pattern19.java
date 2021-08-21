package patters;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=2;
for(int i=1;i<=5;i=i+2)
{
	for(int sp=1;sp<=k;sp++)
		System.out.print(" ");
	k--;
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
k=1;
for(int i=3;i>=1;i=i-2)
{
	for(int sp=1;sp<=k;sp++)
		System.out.print(" ");
	k++;
	for(int j=1;j<=i;j++)
		System.out.print("*");
	System.out.println();
}
	}
}//extra