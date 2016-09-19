package circularLinkLIst;

public class InsertInSortedLL extends CircularLinkList{
	
	
	void insert(Node head,int data){
		
		Node curr=head;
		
		while(curr.next!=head && curr.next.data<=data && curr.next!=null){
			curr=curr.next;
		}
		
		Node newNode = new Node(data); 
		newNode.next=curr.next;
		curr.next= newNode;
		
		this.print(head);
		//System.out.println(curr.data);
		
	}
	
	public static void main(String[] args) {
		
		CircularLinkList circularLinkList = new CircularLinkList();
		
		circularLinkList.push(15);
		circularLinkList.push(12);
		circularLinkList.push(8);
		circularLinkList.push(5);
		
		InsertInSortedLL insertInSortedLL = new InsertInSortedLL();
		insertInSortedLL.insert(circularLinkList.head, 6);
		
		
	}

}
