package Easy;

import java.util.Scanner;
import java.util.Stack;

public class Delete_middle_element_of_the_stack {
	 public static void main (String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        
	        while(t-->0)
	        {
	            int sizeOfStack =sc.nextInt();
	            Stack <Integer> myStack=new Stack<>();
	            
	            //adding elements to the stack
	            for(int i=0;i<sizeOfStack;i++)
	            {
	                int x=sc.nextInt();
	                myStack.push(x);
	                
	            }
	                del obj=new del();
	                obj.deleteMid(myStack,sizeOfStack);
	                
	                while(!myStack.isEmpty())
	                {
	                    System.out.print(myStack.peek()+" ");
	                    myStack.pop();
	                }
	                System.out.println();
	        }
	        
	        
	    }
	}// } Driver Code Ends


	//User function Template for Java

	class del{
	    public void deleteMid_util(Stack<Integer>s,int sizeOfStack,int current)
	    {
	        // if current is equal to half of size of stack
	        if(current==sizeOfStack/2)
	        {
	            s.pop();
	            return;
	        }
	        
	        int x=s.peek();
	        s.pop();
	        current+=1;
	        
	        // recursively call deleteMid
	        deleteMid_util(s,sizeOfStack,current);
	        s.push(x);
	    } 
	    public void deleteMid(Stack<Integer>s,int sizeOfStack)
	    {
	        deleteMid_util(s,sizeOfStack,0);
	    }
	    
	}