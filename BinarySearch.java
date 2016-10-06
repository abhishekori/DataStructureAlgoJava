import java.util.*;

class BinarySearch{

	int[] arr;
	int key;

	public BinarySearch(){

		arr=new int[100];
		key=0;

	}



	int search(){

		for(int i=0;i<this.arr.length;i++)
			System.out.println(this.arr[i]);

		int l,h,m;
		l=0;
		h=this.arr.length-1;
		
		while(l<=h){
			m=(l+h)/2;
			if(key>this.arr[m])
				l=m+1;
			else if(this.arr[m]==this.key)
			{
				System.out.println(m);
				return m;


			}
			else
				h=m-1;

		}

		System.out.println("Element not found");

		return -1;
	}


	public static void main(String[] args){
		int n,res;

		Scanner s = new Scanner(System.in);
		BinarySearch bs = new BinarySearch();
		System.out.println("Please enter the array lenght");
		n=s.nextInt();

		System.out.println("Please enter the sorted array elements");

		for(int i=0;i<n;i++)
			bs.arr[i]=s.nextInt();

		System.out.println("Please enter the key you want to search");
		bs.key=s.nextInt();

		bs.search();

		// if((res=bs.search())!=-1)
		// {
		// 	System.out.println("Element is found at position "+res);
		// }else{
		// 	System.out.println("Element not found");
		// }

	}
}