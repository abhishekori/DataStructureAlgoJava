import java.util.*;

public class Bubble{
  int[] list;

  public Bubble(){
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

    public void bubble(){
      for (int i=0;i<this.list.length ;i++ ) {
        boolean swaped = false;
        for (int j=this.list.length-1;j>i ;j--) {
          if(list[j]<list[j-1])
          {
            swap(j,j-1);
            swaped=true;
          }

        }
        if(!swaped)break;

      }
      print();
    }


    public static void main(String arg[]){

      Bubble b= new Bubble();
      b.bubble();
    }
}
