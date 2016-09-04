import com.sun.org.apache.xpath.internal.operations.And;

public class RotateLinkList extends LinkList{
	
	
	void rotateList(int k){
		
		Node curr= head;
		
		int c=1;
		while(curr.next!=null && c<k){
			curr=curr.next;
			c++;
			
		}
		
		Node kthnode = curr;
		if(curr==null){
			return;
		}
		
		//System.out.println("1  = "+curr.data);
		while (curr.next!=null) {
			curr=curr.next;
			
		}
		//System.out.println("2  =  "+curr.data+"\n\n");
		curr.next=head;
		
		head=kthnode.next;
		
		kthnode.next=null;
			
	}
	
	
	
	public static void main(String[] args) {
		
		RotateLinkList rotateLinkList = new RotateLinkList();
		rotateLinkList.rotateList(3);
		Node temp = rotateLinkList.head;
		while (temp!=null) {
			
			System.out.println(temp.data);			
			temp=temp.next;
			
		}
				
		
		
		
	}

}
