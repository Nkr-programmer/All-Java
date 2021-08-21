package advanced_concept;

public class PART_SUBSET_BITMASKING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int set=15;
	set=	add(set,8);
	set=	remove(set,2);
	    display(set);
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
	
		return  ((i&(1<<(j-1)))==0) ?i=i^(1<<(j-1)):i;
	}
	private static int remove(int i, int j) {
		// TODO Auto-generated method stub
		return    ((i&(1<<(j-1)))!=0)? i=i^(1<<(j-1)):i;
	}

	private static void display(int j) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			if((j&(1<<i))!=0) {System.out.println(i+1);}
		}
		
	}

}