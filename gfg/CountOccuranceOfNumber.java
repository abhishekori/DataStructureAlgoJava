import java.util.Scanner;

public class CountOccuranceOfNumber extends LinkList{

	
	
	void countOccurance(int n){
		
		LinkList.Node n1= head;
		int c=0;
		while(n1!=null){
			if(n1.data==n){
				c++;
			}
			n1=n1.next;
		}
		
		System.out.println("the  number of times "+n+" has occured is "+c);
		
	}
	
	public static void main(String[] args) {
		
		
		
		CountOccuranceOfNumber c=new CountOccuranceOfNumber();
		c.insertNodeAtLast(12);
		c.insertNodeAtLast(12);
		c.insertNodeAtLast(12);
		c.printList();
		System.out.println("Please enter the number you want to check");
		c.countOccurance(new Scanner(System.in).nextInt());
		
	}
}
