package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MULTIPLECOMPANY_Word_Boggle {  public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0)
    {
        int N = sc.nextInt();
        String[] dictionary = new String[N];
        for(int i=0;i<N;i++)
        {
            dictionary[i] = sc.next();
        }
        
        int R = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        
        char board[][] = new char[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                board[i][j] = sc.next().charAt(0);
            }
        }
        Boggle obj = new Boggle();
        
        
        String[] ans = obj.wordBoggle(board, dictionary);
        
        
        if(ans.length == 0) System.out.println("-1");
        else
        {
            Arrays.sort(ans);
            for(int i=0;i<ans.length;i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        
        t--;
    }
}
}


class Boggle
{
	 private boolean search(char board[][], String word, int index, int i, int j)
	    {
	        int n = board.length;
	        int m = board[0].length;
	        
	        // If position of the cell is inside the board or not
	        if(i < 0 || i > n - 1 || j < 0 || j > m - 1) 
	            return false;
	        
	        // If the current cell does not match the letter at index  
	        if( word.charAt(index) != board[i][j]) return false;
	    
	        // If each character is matched
	        if (index == word.length() - 1) return true;
	        
	        char ch = board[i][j];
	        board[i][j] = '#';
	        
	        // Search for adjacent indices
	        int dx[] = {-1,0,+1,-1,+1,-1,0,+1};
	        int dy[] = {+1,+1,+1,0,0,-1,-1,-1};
	        
	        for(int x= 0;x<dx.length;x++)
	        {
	            if(search(board,word,index + 1,i+dx[x],j+dy[x]))
	            {
	                board[i][j] = ch;
	                return true;
	            }
	        }
	        
	        board[i][j] = ch;
	        
	        return false;
	    }
	    
	    private boolean exist(char board[][], String word)
	    {
	        for(int i=0;i<board.length;i++)
	            for(int j=0;j<board[0].length;j++)
	                if(search(board,word,0,i,j)) return true;
	        
	        return false;
	    }
	    
	    public String[] wordBoggle(char board[][], String[] dictionary)
	    {
	        List <String> wordslist = new ArrayList<String>();
	        for(int i=0;i<dictionary.length;i++)
	            if(exist(board,dictionary[i]))
	                wordslist.add(dictionary[i]);
	                
	        String[] ans = wordslist.toArray(new String[0]);
	        // Arrays.sort(ans);
	        return ans;
	    }
	}
