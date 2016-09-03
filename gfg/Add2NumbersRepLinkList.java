import javax.xml.bind.ParseConversionEvent;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.rmi.runtime.Log;

public class Add2NumbersRepLinkList extends LinkList{
	
	long extractNummber(Node head){
		long sum=0;
		Node curr=head;
		int base=1;
		while (curr!=null) {
			
			int num =curr.data;
		
			num=num*base;
			//System.out.println(num);
			sum=sum+num;
			base*=10;
			
			curr=curr.next;
		}
		
		return sum; //sum;	
	}
	
	
	long add2LinkList(LinkList one,LinkList two){
		
		long sum1=this.extractNummber(one.head);
		long sum2=this.extractNummber(two.head);
		
		
		return sum1+sum2;		
	}
	
	void pushNodes(LinkList list,long number){
		//Node curr=list.head;
		long digit; 
		
		while (number!=0) {
			
		digit =number%10;	
		list.insertNodeAtLast((int)digit);
		//System.out.print(digit+" ");
		number=number/10;
		}
		System.out.println("the list is");

		while (list.head!=null) {
			
			System.out.println(list.head.data);
			list.head=list.head.next;			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		Add2NumbersRepLinkList add2NumbersRepLinkList = new Add2NumbersRepLinkList();
		LinkList one = new LinkList();
		LinkList  two = new LinkList();
		LinkList three = new LinkList();
		long sumres = add2NumbersRepLinkList.add2LinkList(one,two);
		System.out.println(sumres);
		add2NumbersRepLinkList.pushNodes(three,sumres);
		
		//System.out.println(add2NumbersRepLinkList.extractNummber(linkList.head));
		
	}

}
