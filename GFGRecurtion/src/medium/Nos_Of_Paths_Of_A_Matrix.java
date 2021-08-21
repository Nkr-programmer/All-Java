package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Nos_Of_Paths_Of_A_Matrix {

	public static void main (String[] args) throws IOException  {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    
		    int k = sc.nextInt();
		    int n = sc.nextInt();
		    int c[][]= new int[n][n];
		    int b=0;
		    for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<n;j++) {
		    		c[i][j]= sc.nextInt();
		    	}
		    }
		    System.out.println(numberOfPaths(n-1,n-1,c,k));
		}
	}


    static long numberOfPaths(int m, int n,int[][] c,int k) {
    	if (m < 0 || n < 0) 
            return 0; 
    if((m == 0 && n == 0)&&k==c[m][n])return 1;
    return  numberOfPaths(m-1, n,c,k-c[m][n]) + numberOfPaths(m, n-1,c,k-c[m][n]);
  
    }

}//dp
//2
//16
//3
//1 2 3 4 6 5 9 8 7
//12
//3
//1 2 3 4 6 5 3 2 1