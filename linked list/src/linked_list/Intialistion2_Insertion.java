package linked_list;

import linked_list.Initialisaton.node;

public class Intialistion2_Insertion {

	node head;

		 void printlist(){
			node n=head;
			while(n!=null)
			{
				System.out.print(n.data+" ");
				n=n.next;
			}
		 }

			 void start(int new_data){
				node new_node = new  node(new_data);
				new_node.next=head;
				head=new_node;
		
	}
			 void middle(int new_data,node pre_node){
				 if(pre_node==null)
				 {
					 
				 }
					node new_node = new  node(new_data);
					
					new_node.next=pre_node.next;
					pre_node.next=new_node;
					
			
		}
			 void end(int new_data){
					
				 node new_node = new  node(new_data);
					if(head==null)
					{
						head=new_node;
					}
					new_node.next=null;

					node last=head;
					while(last.next!=null)
					last=last.next;
						last.next=new_node;
					
			
		}
	 
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Intialistion2_Insertion list=new Intialistion2_Insertion();
			 
			 
			 list.head = new node(1); 
			  node second = new node(2);
			  node third = new node(3);
			
			
			list.head.next  = second;
			second.next=third;
			
			list.start(0);
			list.middle(4,list.head.next);
			list.end(5);
		     list.printlist();	
			
		}


	}
