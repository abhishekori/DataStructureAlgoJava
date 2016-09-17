package circularLinkLIst;

public class CircularLinkList {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next=null;
		}
	}
	
	public CircularLinkList() {
		// TODO Auto-generated constructor stub
		
		head=null;
//		this.push(3);
//		this.push(2);
//		this.push(1);
	}
	
	void push(int num){
		
		Node curr = head;
		Node newNode = new Node(num);
		
		newNode.next = head;
		
		if(curr!=null){
			while(curr.next!=head){
				curr=curr.next;
			}
			curr.next = newNode;
			
		}else{
			newNode.next = newNode;
		}
		
		head=newNode;
	}
	
	void print(Node head){
		Node curr= head;
		
		if(curr!=null){
			do{
				System.out.println(curr.data);
				curr=curr.next;
				
			}while(curr!=head);
		}
	}
	
	
	public static void main(String[] args) {
		
		CircularLinkList circularLinkList = new CircularLinkList();
		
//		circularLinkList.push(5);
//		circularLinkList.push(33);
		//circularLinkList.push(23);
		circularLinkList.print(circularLinkList.head);
		
	}

}
