package patters;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
for(int i=10;i>=1;i--)
{
	for(int sp=i-1;sp>=1;sp--)
	{
		System.out.print(" ");
		
	}
	for( j=i;j<=9;j++)
	{
		System.out.print(j);
		
	}
	if(j>=9)
		System.out.print("0");
	
	for(int k=9;k>=i;k--)
		System.out.print(k);
	System.out.println();
	
}//extra
	}

}
