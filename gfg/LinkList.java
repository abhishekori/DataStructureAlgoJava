import java.util.*;

class  LinkList{
	Node head; // Head is the pointer which points to the first element in the list

	static class Node{ // This class represents one node in the link list
		int data; // data in each node
		Node next; // next pointer posints to the next element

		public Node(int d){ // Prameterised contructor which inilizes the node
			data=d;
			next=null;
		}


	}

	void printList(){ // Print the items in the Link List
		Node n = head;

		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}


	 void deleteNode(int key){
		Node temp=head,prev=null;

		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}

		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}


		prev.next=temp.next;
	  }

	void pushNode(int new_data){

	Node new_node = new Node(new_data); // create a new node
	new_node.next=this.head; // point new node to node pointed by head
	this.head=new_node;  // point head to new node



	}

	void insertNodeAfter(Node prev_node,int new_data){


		Node new_node = new Node(new_data); // create a node
		new_node.next=prev_node.next; // point new node next to prev node next
		prev_node.next=new_node; // point prev node next to new node

	}

	void insertNodeAtLast(int new_data){

		Node new_node = new Node(new_data); // create new node
		new_node.next=null; // point the next of new node to null as it ll be the last node

		Node temp=this.head;

		while(temp.next!=null){ // loop thorugh till you reach the last node
			temp=temp.next;
		}

		temp.next=new_node; // point the current last node to new node
	}


	public Node getNode(int key){

		Node temp = head,curr_node=null;

		while(temp!=null && temp.data!=key)
		{

			temp=temp.next;
		}

		return temp;  // returns node of the data which has its content


	}

	public void deleteNodeByIndex(int index){

		Node temp=head,prev=null;
		int i=0;

		while(temp!=null && i!=index){

			i++;
			prev=temp;
			temp=temp.next;
		}

		prev.next=temp.next;


	}

	public int getCount(){

		int count=0;
		Node h=this.head;

		while(h!=null){
			count++;
			h=h.next;
		}

		return count;

	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int option;
		int num;
		char yn;

		LinkList list = new LinkList(); // Initilize the list
		Node first = new Node(1); // Creating 1st node
		Node second = new Node(2); // create 2nd node
		Node third = new Node(3); // create third node

		list.head = first; // connecting head to first node

		first.next=second; // connecting first.next pointer to second node
		second.next=third; // connecting second.next pointer to third node

		 list.printList();

		 Node test =list.getNode(2);

		 System.out.println("the got node is "+test.data);

		System.out.println("Please choose the option \n 1. insert at begening \n 2. Insert in after a node \n 3. Insert at the last \n 4. Delete a node \n 5, delete node by index \n 6. Count the number of nodes");
		option = s.nextInt();

		switch(option){

			case 1:
			System.out.println("Please enter the number to insert");
			System.out.print("Insert an element? (y/n) :");
			yn=s.next().charAt(0);
				if(yn=='y')
				{
					while(true)
					{
						System.out.print("number: ");
						num=s.nextInt();
						list.pushNode(num);
						System.out.print("Insert another element? (y/n) :");
						yn=s.next().charAt(0);
						if(yn=='n') break;

					}
					System.out.print("List contents: ");
					list.printList();
					System.out.println();
				}
			  System.out.println("Thank you");

			break;

			case 2:

			int prev_num;
			System.out.println("Please enter the number to insert");
			System.out.print("Insert an element? (y/n) :");
			yn=s.next().charAt(0);
				if(yn=='y')
				{
					while(true)
					{
						System.out.print("number: ");
						num=s.nextInt();
						System.out.print("previous number: ");
						prev_num = s.nextInt();

						list.insertNodeAfter(list.getNode(prev_num),num);
						System.out.print("Insert another element? (y/n) :");
						yn=s.next().charAt(0);
						if(yn=='n') break;

					}
					System.out.print("List contents: ");
					list.printList();
					System.out.println();
				}
			  System.out.println("Thank you");

			break;

			case 3:

			System.out.println("Please enter the number to insert");
			System.out.print("Insert an element? (y/n) :");
			yn=s.next().charAt(0);
				if(yn=='y')
				{
					while(true)
					{
						System.out.print("number: ");
						num=s.nextInt();
						list.insertNodeAtLast(num);
						System.out.print("Insert another element? (y/n) :");
						yn=s.next().charAt(0);
						if(yn=='n') break;

					}
					System.out.print("List contents: ");
					list.printList();
					System.out.println();
				}
			  System.out.println("Thank you");

			break;



			case 4:

			System.out.println("Please enter the number to Delete");
			System.out.print("Delete an element? (y/n) :");
			yn=s.next().charAt(0);
				if(yn=='y')
				{
					while(true)
					{
						System.out.print("number: ");
						num=s.nextInt();
						list.deleteNode(num);
						System.out.print("Delete another element? (y/n) :");
						yn=s.next().charAt(0);
						if(yn=='n') break;

					}
					System.out.print("List contents: ");
					list.printList();
					System.out.println();
				}
			  System.out.println("Thank you");

			break;

			case 5:

			System.out.println("Please enter the index to Delete");
			System.out.print("Delete an element? (y/n) :");
			yn=s.next().charAt(0);
				if(yn=='y')
				{
					while(true)
					{
						System.out.print("index: ");
						num=s.nextInt();
						list.deleteNodeByIndex(num);
						System.out.print("Delete another element? (y/n) :");
						yn=s.next().charAt(0);
						if(yn=='n') break;

					}
					System.out.print("List contents: ");
					list.printList();
					System.out.println();
				}
			  System.out.println("Thank you");

			break;

			case 6:
				System.out.println(list.getCount());
				break;

			default: System.out.print("Wrong option");


		}



	}
}
