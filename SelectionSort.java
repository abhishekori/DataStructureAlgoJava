import java.util.*;
public class SelectionSort{



int[] list;

public SelectionSort(){
  list = new int[5];
  list[0]=5;
  list[1]=6;
  list[2]=2;
  list[3]=9;
  list[4]=1;
}


  public  void swap(int i,int j){
    int temp;
    temp=this.list[i];
    this.list[i]=this.list[j];
    this.list[j]=temp;

  }

  public void print(){
    for (int el : this.list ) {
      System.out.print(el+",");
    }

    System.out.println();
  }

public void selectionSort(){
  for(int i=0;i<this.list.length;i++)
  {
    for(int j=i+1;j<this.list.length;j++)
    {
      if(this.list[j]<this.list[i])
      {
        this.swap(i,j);

      }
    }
  }
  this.print();
}


public static void main(String[] arg){
//   int n;
//   System.out.print("Please enter the n");
//   Scanner s= new Scanner(System.in);
//   n=s.nextInt();
//   System.out.print("input the values");
//
//
// ss.list[0]=Integer.parseInt(arg[0]);
// ss.list[1]=Integer.parseInt(arg[1]);
// ss.list[2]=Integer.parseInt(arg[2]);
// ss.list[3]=Integer.parseInt(arg[3]);
//   // for(int i=0;i<n;i++)
//   // {
//   //   ss.list[i]=s.nextInt();
//   // }
 SelectionSort ss=new SelectionSort();
ss.selectionSort();


}
}
