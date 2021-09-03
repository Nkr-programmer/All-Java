package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

//3
//4 5
//4 3 2 7
//3 4
//1 2 3
//3 3
//1 2 3
//
//4
//2
//3
public class F {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
		StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int		m = Integer.parseInt(st.nextToken());
			 st = new StringTokenizer(br.readLine());
int a[]= new int[n];
			 for(int i=0;i<n;i++)
{a[i]= Integer.parseInt(st.nextToken());}
			 if(n==1){System.out.println((m==1?a[0]:m>=a[0]?1:((a[0]/m)+1)));}
	          else{          
	Arrays.sort(a);	
	if(a[n-1]<=m)System.out.println(1);
	else {
		int x= binarySearch(a,0,n-1,m,a[n-1]);	
		System.out.println("ans"+x);
	}
	}
			T--;
			}
		

	}

	private static int binarySearch(int[] a, int i, int j,int m,int ans) {
		if(i<=j)
		{
		int mid=(i+j)/2;
		int sum=check(a,mid);
		if(sum<=m) {ans=Math.min(ans,a[mid]);}
		if(i==mid) {
			System.out.println("XYZ");
			sum=check(a,j);
			if(sum<=m) {ans=Math.min(ans,a[j]);
			}
			
 			return ans;}
	if(sum>=m)	ans=	binarySearch(a,mid+1,j,m,ans);	
	else if(sum<m) ans=	binarySearch(a,i,mid-1,m,ans);
		
		}
		return ans;
	}

//	private static int getit(int[] a, int i, int j,int m,int ans,int z) {
//if(i<=j) {
//	System.out.println(i+"  "+j);
//	int mid=(i+j)/2;
//	int sum=checks(a,mid,z);
//	if(sum<=m) {ans=Math.min(ans, mid);return ans;}
//	if(sum>=m)	ans=	getit(a,mid+1,j,m,ans,z);	
//	else if(sum<m) ans=	getit(a,i,mid-1,m,ans,z);
//}
//return ans;	
//	}
//	private static int checks(int[] a, int m,int z) {;
//	int x=z;
//	for(int i=z+1;i<a.length;i++)
//	{x+=a[i]%m==0?a[i]/m:((a[i]/m)+1);}
//			return x;
//		}
	
	private static int check(int[] a, int m) {;
int x=m+1;
for(int i=m+1;i<a.length;i++)
{x+=a[i]%a[m]==0?a[i]/a[m]:((a[i]/a[m])+1);}
System.out.println(x);
		return x;
	}
}