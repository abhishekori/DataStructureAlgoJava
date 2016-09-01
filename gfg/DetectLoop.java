
public class DetectLoop extends LinkList{
	
	void detectLoop(){
		LinkList.Node n1 = head;
		LinkList.Node n2 = head;
		while(n2!=null && n1!=null && n2.next!=null){
			
			n1=n1.next;
			n2=n2.next.next;
			
			if(n1.data==n2.data){
				
				System.out.println("Loop detected");
				return;
			}
			
			
		}
		
		System.out.println("No loop");
	}
	
	
	public static void main(String[] args) {
		
		DetectLoop d = new DetectLoop();
		d.detectLoop();
		
		
	}

}
