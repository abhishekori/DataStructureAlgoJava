
public class Merge{
	
	static Node h1,h2;
	
	class Node{
		int data;
		Node next;
		
		public  Node(int d) {
			this.data=d;
			this.next=null;
			
		}
	}
	
	
	public Merge() {
		
		
		
		Node a1=new Node(2);
		Node a2=new Node(26);
		Node a3=new Node(45);
		Node a4=new Node(98);
		this.h1=a1;
		a1.next=a2;
		a2.next=a3;
		a3.next=a4;
		
		Node b1=new Node(5);
		Node b2=new Node(12);
		Node b3=new Node(78);
		Node b4=new Node(91);
		this.h2=b1;
		b1.next = b2;
		b2.next = b3;
		b3.next = b4;
		
	}
	
	public Merge.Node mergeList(Node a1,Node a2){
		
		//System.out.println(a1.next.data);
		Node result;
		//a1=a1.next;
		//a2=a2.next;
		if(a1.data<=a2.data){
			result=a1;
			result.next=mergeList(a1.next,a2);
		}else{
			result=a2;
			result.next=mergeList(a1, a2.next);
		}
		
		return result;
	}
	
	
	
	public static void   main(String[] args) {
		
		
		Merge merge = new Merge();
		
		while(merge.h1!=null){
			System.out.println(merge.h1.data);
			merge.h1=merge.h1.next;
		
		}
		
		while(merge.h2!=null){
			System.out.println(merge.h2.data);
			merge.h2=merge.h2.next;
		
		}
		
		Node res= merge.mergeList(merge.h1,merge.h2);
//		while(res!=null){
//			System.out.println(res.data);
//			
//			res=res.next;
//			
//		}
	}
	

}
