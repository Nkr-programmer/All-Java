package basic;

public class Nos_of_Monotones {

	public static void main(String[] args) {
		
// Monotones		
int n=4;
int dp[]= new int[10];

for(int i=1;i<=9;i++) {dp[i]=i;}
for(int t:dp) {System.out.print(t+" ");}System.out.println();// printing
for(int i=2;i<=n;i++)
{
for(int j=1;j<=9;j++)	{dp[j]=dp[j]+dp[j-1];	}

for(int t:dp) {System.out.print(t+" ");}System.out.println();//printing
}

// Strick Monotones
System.out.println("Strick Monotones");
int n1=5;
int dp1[]= new int[10];

for(int i=1;i<=9;i++) {dp1[i]=i;}
for(int t:dp1) {System.out.print(t+" ");}System.out.println();// printing
for(int i=2;i<=n1;i++)
{int expected =0;
for(int j=i;j<=9;j++)	{ int temp=expected;expected=expected+dp1[j-1];dp1[j-1]=temp;}
dp1[9]=expected;
for(int t:dp1) {System.out.print(t+" ");}System.out.println();//printing
}	
	
	}

}