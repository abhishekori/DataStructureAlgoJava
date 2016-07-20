import java.util.*;

public class Insertion{

  int[] list;

  public Insertion(int length){
    list = new int[length];
    // list[0]=5;
    // list[1]=6;
    // list[2]=2;
    // list[3]=9;
    // list[4]=1;
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
      public void insertion(){
        for (int i=0;i<this.list.length-1;i++ ) {
          for (int j=i+1;j>0 ;j-- ) {
            if(this.list[j]<this.list[j-1]){
              swap(j,j-1);
            }else{
              break;
            }

          }

        }
        print();
      }

      public static void main(String arg[]){
        Scanner s=new Scanner(System.in);

        System.out.println("Please input the size");
        int n = s.nextInt();
        Insertion i=new Insertion(n);
        System.out.println("Please input the values");
        for (int ii=0;ii<5 ;ii++ ) {
          i.list[ii]=s.nextInt();
        }
        i.insertion();

      }
}
