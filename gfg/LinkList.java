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

	void pushNode(int new_data){

	Node new_node = new Node(new_data);
	new_node.next=this.head;
	this.head=new_node;



	}

	void insertNodeAfter(Node prev_node,int new_data){


		Node new_node = new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;

	}

	void insertNodeAtLast(int new_data){

		Node new_node = new Node(new_data);
		new_node.next=null;

		Node temp=this.head;

		while(temp.next!=null){
			temp=temp.next;
		}

		temp.next=new_node;
	}


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int option;
		int num;
		char yn;

		LinkList list = new LinkList(); // Initilize the list
		// Node first = new Node(1); // Creating 1st node
		// Node second = new Node(2); // create 2nd node
		// Node third = new Node(3); // create third node

		// list.head = first; // connecting head to first node 

		// first.next=second; // connecting first.next pointer to second node
		// second.next=third; // connecting second.next pointer to third node

		// list.printList();

		System.out.println("Please choose the option \n 1. insert at begening \n 2. Insert in after a node \n 3. Insert at the last");
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
						list.insertNodeAfter(prev_num,num);
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

			default: System.out.print("Wrong option");

		}



	}
}