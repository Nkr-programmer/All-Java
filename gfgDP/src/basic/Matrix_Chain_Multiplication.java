package basic;

public class Matrix_Chain_Multiplication {

	public static void main(String[] args) {
		  int arr[] = new int[] { 3,2,4,2,5 };
	        int size = arr.length;
	 
	        System.out.println(
	            "Minimum number of multiplications is "
	            + MatrixChainOrder(arr, size));
	}

	private static int MatrixChainOrder(int[] p, int size) {
		int n=size,q;
		int m[][]= new int[size][size];
		int ki[][]= new int[size][size];
		for(int i=0;i<size;i++)
		{m[i][i]= 0;}		
		int j;
        for (int L = 2; L < n; L++)
        {
            for (int i = 1; i < n - L + 1; i++)
            {
                j = i + L - 1;
                if (j == n)
                    continue;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++)
                {
                    // q = cost/scalar multiplications
                    q = m[i][k] + m[k + 1][j]
                        + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j])
                        {m[i][j] = q;ki[i][j]=k;}
                }
            }
        }
        for(int i=0;i<n;i++)
        {
        	for(int z=0;z<n;z++)
        	{
        		System.out.print(m[i][z]+" ");
        	}
        	System.out.println();
        }
        for(int i=0;i<n;i++)
        {
        	for(int z=0;z<n;z++)
        	{
        		System.out.print(ki[i][z]+" ");
        	}
        	System.out.println();
        }	
 
        return m[1][n - 1];}

}
