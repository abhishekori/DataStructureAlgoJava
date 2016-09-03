import java.util.LinkedList;
import java.util.Scanner;

public class ReverseNodesInBatch extends LinkList{
	
	Node reverseNodes(Node head,int n){
		
		Node current = head;
		Node next = null;
		Node prev = null;
		int count = 0;
		while(count < n && current!=null){
			next = current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next!=null){
			head.next = reverseNodes(next,n); 
		}
		
		return prev;
		
	}
	
	public static void  main(String[] args) {
		
		ReverseNodesInBatch r = new ReverseNodesInBatch();
		LinkList linkList= new LinkList();
		
		System.out.println("Please enter the each batch size you want to be reversed \n");
		Node res = r.reverseNodes(linkList.head,new Scanner(System.in).nextInt());
		
		while(res!=null){
			System.out.println(res.data);
			res=res.next;
		}
		
		
	}

}
