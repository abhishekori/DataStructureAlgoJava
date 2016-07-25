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


	public static void main(String[] args){

		LinkList list = new LinkList(); // Initilize the list
		Node first = new Node(1); // Creating 1st node
		Node second = new Node(2); // create 2nd node
		Node third = new Node(3); // create third node

		list.head = first; // connecting head to first node 

		first.next=second; // connecting first.next pointer to second node
		second.next=third; // connecting second.next pointer to third node

		System.out.println("Success full in creating nodes "+list.head.data+" "+second.data+" "+third.data); // printng the nodes
	}
}