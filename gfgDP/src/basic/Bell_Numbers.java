package basic;

public class Bell_Numbers {

	public static void main(String[] args) {
int n=10,k=2;
//O(2^n) stirling is formula which is used to find bell number
System.out.println("Stiring Number"+stirling(n,k));
// O(n*k) Dp for stirling O(n*n*k) for bell number
int bell_number=0;
for(int i=1;i<=n;i++) {bell_number+=stirlingdp(n,i);}
System.out.println("Bell Numer is sum of all stirling number\n"+bell_number);
// O(n*n) DP by bell triangle
for(int i=1;i<=n;i++) {System.out.println("\n"+triangle(i));}
	
	
//0(n)  permutations similar to stirling but not stirling stirling(n-1,k)+k*stirling(n-1,k-1) 
 System.out.println(permutation(n,k));
	}

	private static int permutation(int n, int k) {
		int fact[]= new int[n+1];
		fact[0]=1;
		for(int i=1;i<=n;i++) {
			fact[i]=fact[i-1]*i;
		}
		return fact[n]/fact[n-k];
	}

	private static int triangle(int n) {
		int a[][]= new int[n+1][n+1];a[0][0]=1;
		for(int i=1;i<=n;i++)
		{a[i][0]=a[i-1][i-1];
		for(int j=1;j<=i;j++) {a[i][j]=a[i][j-1]+a[i-1][j-1];}
		}
		
		return a[n][0];
	}

	private static int stirlingdp(int n, int k) {
		int a[][]= new int[n+1][k+1];
		
		for(int i=1;i<=n;i++)
		for(int j=1;j<=k;j++)
		{
			if(j==1||j==i) {a[i][j]=1;}
			else {a[i][j]= j*a[i-1][j]+a[i-1][j-1];}
			
		}
		return a[n][k];
	}

	private static int stirling(int n, int k) {
	
		if(n==0||k==0||k>n)return 0;
		if(k==1||k==n)return 1;
		
		
		return (k*stirling(n-1,k))+stirling(n-1,k-1);
	}
}
