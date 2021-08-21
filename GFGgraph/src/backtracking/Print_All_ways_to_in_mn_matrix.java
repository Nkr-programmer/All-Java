package backtracking;

public class Print_All_ways_to_in_mn_matrix {
	 public static void main(String[] args)
	    {
	        int m = 2;
	        int n = 3;
	        int mat[][] = { { 0, 1, 2 },
	                        { 3, 4, 5 } };
	        int maxLengthOfPath = m + n - 1;
	        printMatrix(mat, m, n, 0, 0, new int[maxLengthOfPath], 0);
	    }
	private static void printMatrix(int mat[][], int m, int n,
            int i, int j, int path[], int idx)
{

		path[idx] = (i*n)+j;

		if (i == m - 1) {
			for (int k = j + 1; k < n; k++)
            {path[idx + k - j] = (i*n)+k;}
			
             for (int l = 0; l < idx + n - j; l++)
             {System.out.print(path[l] + " ");}
              System.out.println();
               return; }
		
      if (j == n - 1){
             for (int k = i + 1; k < m; k++)
             {path[idx + k - i] = (k*n)+j;}

             for (int l = 0; l < idx + m - i; l++)
             {System.out.print(path[l] + " ");}
             System.out.println();
               return;}
      
printMatrix(mat, m, n, i + 1, j, path, idx + 1);
printMatrix(mat, m, n, i, j + 1, path, idx + 1);
}	
	}
