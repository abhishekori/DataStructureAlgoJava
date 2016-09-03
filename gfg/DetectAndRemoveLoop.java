

public class DetectAndRemoveLoop extends LinkList{
	
	public void detectAndRemoveLoop(Node head) {
		
		
		Node n1=head;
		Node n2=head;
		
		while (n1!=null && n2!=null && n2.next!=null) {
			
			n1=n1.next;
			n2=n2.next.next;
			
			if (n1==n2){
				removeLoop(n1,head);
				return;
				
			}
			
		}
		System.out.println("No loop found");
		return;
		
	}
	
	private void removeLoop(Node loop,Node curr) {
		Node ptr1=null;
		Node ptr2 = null;
		ptr1=curr;
		
		while (true) {
			
			ptr2=loop;
			
			while(ptr2.next!=loop && ptr2.next!=ptr1 ){
				
				ptr2=ptr2.next;				
			}
			
			if(ptr2.next==ptr1){
				break;
			}
			
			ptr1=ptr1.next;		
			
		}
		
		ptr2.next=null;
		
	}
	
	
	
	public static void main(String[] args) {
		
		DetectAndRemoveLoop detectAndRemoveLoop = new DetectAndRemoveLoop();
		LinkList linkList = new LinkList();
		detectAndRemoveLoop.detectAndRemoveLoop(linkList.head);
		while (linkList.head!=null) {
			System.out.println(linkList.head.data);
			linkList.head = linkList.head.next;
			
		}
		
	}

}
