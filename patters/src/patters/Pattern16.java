package patters;

public class Pattern16 {

	public static void main(String[] args) {
	
for(int i=1;i<=5;i++)
{
	for(int sp=4;sp>=i;sp--)
	{
		System.out.print(" ");
	}  
for(int j=1;j<=i;j++)
    {
	if((i==3&&j==2) || ((i==4)&& (j==2 || j==3)))
		System.out.print(" ");
    else
    {
	System.out.print("*");
	
	}
    }
System.out.println();
    }
}
}
//extra

	
