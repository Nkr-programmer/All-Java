package gfgmedium;

import java.util.Arrays;
import java.util.Scanner;

public class Nuts_and_Bolts_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,k=0,h=0,g=0,m;
				boolean x=false;
				boolean y=false;
				
				n=sc.nextInt();
				int r=0;
			String a[]=new String [n];
			String b[]=new String [n];
				
				for(int i=0;i<n;i++)
				{
					
					
						
						a[i]=sc.nextLine();
						b[i]=sc.nextLine();
	
				}
				
				  String c=""; 
				int u=0,w=0;
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
				
						if(a[i]==a[j])
						{
						u=i;
						w=j;
						x=true;	
							
						}
					}
				if(x==true)
				{
					if(a[i].equals("!"))
					{
						c=a[i];
						a[i]=a[r];
						a[r]=c;
						
						c=b[w];
						b[w]=a[r];
						b[r]=c;
						r++;
						y=true;
					}
					else
						if(a[i].equals("#"))
						{
							if(y==true)
							{
								r=1;
							}
							else
							{
								r=0;
							}
							c=a[i];
							a[i]=a[r];
							a[r]=c;
							
							c=b[w];
							b[w]=a[r];
							b[r]=c;
						
							
							
							
						}
					
						else
							if(a[i].equals("$"))
							{
								c=a[i];
								a[i]=a[2];
								a[2]=c;
								
								c=b[w];
								b[w]=a[2];
								b[2]=c;
								
							}else
								if(a[i].equals("%"))
								{
									c=a[i];
									a[i]=a[3];
									a[3]=c;
									
									c=b[w];
									b[w]=a[3];
									b[3]=c;
									
								}
								else
									if(a[i].equals("&"))
									{
										c=a[i];
										a[i]=a[4];
										a[4]=c;
										
										c=b[w];
										b[w]=a[4];
										b[4]=c;
										
									}
									else
										if(a[i].equals("*"))
										{
											c=a[i];
											a[i]=a[5];
											a[5]=c;
											
											c=b[w];
											b[w]=a[5];
											b[5]=c;
											
										}
										else
											if(a[i].equals("@"))
											{
												c=a[i];
												a[i]=a[6];
												a[6]=c;
												
												c=b[w];
												b[w]=a[6];
												b[6]=c;
												
											}
											else
												if(a[i].equals("^"))
												{
													c=a[i];
													a[i]=a[7];
													a[7]=c;
													
													c=b[w];
													b[w]=a[7];
													b[7]=c;
													
												}
												else
													if(a[i].equals("~"))
													{
														c=a[i];
														a[i]=a[8];
														a[8]=c;
														
														c=b[w];
														b[w]=a[8];
														b[8]=c;
														
													}
					
					
					
					
					
					
				}
					
					
				}
				
				
				
				
				
				
				
	
				for(int i=0;i<n;i++)
				{
					
					
						
						System.out.print(a[i]);
						
	
				}
	System.out.println();
				for(int i=0;i<n;i++)
				{
					
					
						
						System.out.print(b[i]);
						
	
				}
				
				
				
					
				
				
		
				System.out.println();
				
				t--;
		 }
		
		
		
		
		
		
		
		
		
	}

}
