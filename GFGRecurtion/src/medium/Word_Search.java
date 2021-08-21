package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Word_Search {
	   public static void main(String[] args) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int T = Integer.parseInt(br.readLine().trim());
	        while(T-->0)
	        {
	            String[] S = br.readLine().trim().split(" ");
	            int n = Integer.parseInt(S[0]);
	            int m = Integer.parseInt(S[1]);
	            char [][] board = new char[n][m];
	            for(int i = 0; i < n; i++){
	                String[] s = br.readLine().trim().split(" ");
	                for(int j = 0; j < m; j++){
	                    board[i][j] = s[j].charAt(0);
	                }
	            }
	            String word = br.readLine().trim();
	            Search obj = new Search();
	            boolean ans = obj.isWordExist(board, word);
	            if(ans)
	                System.out.println("1");
	            else
	                System.out.println("0");
	       }
	    }
	}// } Driver Code Ends


	class Search
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
		        int dx[] = {0,-1,+1,0};
		        int dy[] = {+1,0,0,-1};
		        
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
		
	    public boolean isWordExist(char[][] board, String dictionary)
	    {
	    	 List <String> wordslist = new ArrayList<String>();
		        return  exist(board,dictionary);	        // Code here
	    }
	}