package basic;

public class Gold_Mine_Problem {

	public static void main(String[] args) {
		int  mat[][] = { {1, 3, 1, 5},
                {2, 2, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 1, 2}};
		// O(M*N)
		int gold[][]= new int[mat.length][mat[0].length];
for(int i=0;i<mat.length;i++)
{gold[i][0]= mat[i][0];}
int n=mat.length;
for(int j=0;j<mat[0].length;j++)
{
	for(int i=0;i<mat.length;i++)
	{int a=0,b=0,c=0;
int d=gold[i][j];
if(i-1>=0&&j+1>=0&&j+1<n&&i-1<n) 
{
	a=mat[i-1][j+1];if(gold[i-1][j+1]<d+a) {gold[i-1][j+1]=d+a;}
}
if(i>=0&&j+1>=0&&j+1<n&&i<n) 
{
	b=mat[i][j+1];if(gold[i][j+1]<d+b) {gold[i][j+1]=d+b;}
}
if(i+1<n&&j+1>=0&&j+1<n&&i+1<n) 
{
	c=mat[i+1][j+1];if(gold[i+1][j+1]<d+c) {gold[i+1][j+1]=d+c;}
}
	}	
	System.out.println();
	
}	
	
	}

}
