package circularLinkLIst;

public class SplitLinkList extends CircularLinkList{
	
	void split(Node head){
		
		
		Node curr = head;
		Node middle = head;
		Node head2=head;
		int l=0;
		while (curr.next!=head) {
			l++;
			if(l%2==0){
				head2=middle;
				middle=middle.next;
			}
			
			curr=curr.next;
		}
		
		if(l%2==1){
			head2=middle;
			middle=middle.next;
		}
		
		head2.next=head;
		curr.next=middle;
//		System.out.println("Printing the prev node");
//		System.out.println(head2.data);
		System.out.println("Printing the first part of the  list");
		print(head);
		
		System.out.println("Printing the second part of the list");
		print(middle);
	}
	
	
	
	
	public static void main(String[] args) {
		
		SplitLinkList splitLinkList = new SplitLinkList();
		splitLinkList.push(11);
		splitLinkList.push(2);
		splitLinkList.push(56);
		splitLinkList.push(12);
		splitLinkList.split(splitLinkList.head);
		
	}

}
