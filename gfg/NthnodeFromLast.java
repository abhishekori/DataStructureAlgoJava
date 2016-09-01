
public class NthnodeFromLast extends LinkList{
	
	
	
	void nthNodeFromLast(int n){
		LinkList.Node n1 = head;
		LinkList.Node n2 = head;
		
		for(int i=0;i<n;i++){
			n1=n1.next;
		}
		
		while(n1!=null){
			n1=n1.next;
			n2=n2.next;
			
		}
		
		System.out.println("The nth node from last is"+n2.data);
	}
	

	
	public static void main(String[] args) {
		
		NthnodeFromLast n = new NthnodeFromLast();
		n.printList();
		n.nthNodeFromLast(5);
		
		
	}
}
