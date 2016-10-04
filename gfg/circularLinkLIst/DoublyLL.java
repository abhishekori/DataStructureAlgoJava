package circularLinkLIst;

import java.util.LinkedList;

public class DoublyLL{
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		public  Node(int data) {
			this.data =data;
			next=null;
			prev=null;
			
		}
	}
	
	public DoublyLL() {
		// TODO Auto-generated constructor stub
		head=null;
	}
	
	public void insertBegening(int data) {
		
		Node node = new Node(data);
		
		node.next=head;
		node.prev=null;
		
		if(head!=null){
			head.prev=node;
		}
		
		head=node;
		
	}
	
	public void print() {
		
		Node curr = head;
		
		while (curr!=null) {
			
			System.out.println(curr.data);
			curr = curr.next;
			
		}
		
	}
	
	
	public static void main(String[] args){
		
		DoublyLL doublyLL = new DoublyLL();
		doublyLL.insertBegening(5);
		doublyLL.insertBegening(54);
		doublyLL.insertBegening(52);
		doublyLL.insertBegening(15);
		doublyLL.insertBegening(345);
		doublyLL.print();
		
	}

}
