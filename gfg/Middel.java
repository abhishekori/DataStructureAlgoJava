

public class Middel extends LinkList{
	

	
	
	
	void printmiddle(){
		
		LinkList.Node n1= head;
		LinkList.Node n2 =head;
		
		while(n2!=null && n2.next!=null){
			
			
			n1=n1.next;
			n2=n2.next.next;
			
		}
		
		System.out.println("\nthe middle element is "+n1.data);
		
	}
	
	
	
	
	public static void main(String[] args){
		
		Middel mid = new Middel();
		mid.printList();
		mid.printmiddle();
	}

}
