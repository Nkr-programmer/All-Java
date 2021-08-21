package linked_list;

 class Initialisaton {
node head;
static class node{
	int data;
	node next;
	
	node(int d){
		data= d;
		next=null;
	}
}
	 void printlist(){
		node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
		
	
}
 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Initialisaton list=new  Initialisaton();
		 
		 
		 list.head = new node(1); 
		  node second = new node(2);
		  node third = new node(3);
		
		
		list.head.next  = second;
		second.next=third;
		
	     list.printlist();	
		
	}


}