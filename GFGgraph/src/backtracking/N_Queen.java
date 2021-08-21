package backtracking;

import java.util.Arrays;
//O(2^N)
public class N_Queen {
	public static void main(String[] args) {
		//  O(8^(n^2))
solvenq();
	}
static int N=12;
	private static boolean solvenq() {
		int [][]a= new int[N][N];
			if(solveNQUtil(a,0)) {
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			return true;}
		else {System.out.println("not possible");return false;}
		
	}void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
    }
    static boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
  
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
  
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
  
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;
  
        return true;
    }
  
    static boolean solveNQUtil(int board[][], int col)
    {
        if (col >= N)
            return true;
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
  
                if (solveNQUtil(board, col + 1) == true)
                    return true;
                board[i][col] = 0; // BACKTRACK
            }
        }
        return false;
    }
    static int []cl = new int[30];
    static int []ld = new int[30];
    static int []rd = new int[30];
//without is Safe function 
    // because left diagonal is constant for (row -column+N-1){(1,0),(2,1)(3,2)}
    // because right diagonal is constant for (row +colum){(3,0),(1,2),(0,3)}
    static boolean solveNqUtil(int board[][], int col)
    {
        if (col >= N)
            return true;
      
        for (int i = 0; i < N; i++)
        {
            if ((ld[i - col + N - 1] != 1 &&
                 rd[i + col] != 1) && cl[i] != 1)
            {
                board[i][col] = 1;
                ld[i - col + N - 1] =
                rd[i + col] = cl[i] = 1;
                if (solveNqUtil(board, col + 1))
                    return true;
                board[i][col] = 0; // BACKTRACK
                ld[i - col + N - 1] =
                rd[i + col] = cl[i] = 0;
            }
        }
     return false;
    }

}
