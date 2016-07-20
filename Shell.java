import java.util.*;

public class Shell{
  int[] list;

  public Shell(int length){
    list = new int[length];

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

    public void shell(){
      int inc=this.list.length/2;
      while(inc>=1)
      {
        for (int si=0;si<inc;si++) {
          this.insertion(si,inc);

        }

        inc=inc/2;
      }
      this.print();

    }

    public void insertion(int si,int inc){

      for (int i=si;i<this.list.length ;i+=inc) {
        for(int j=Math.min(i+inc,this.list.length-1);j-inc>=0;j-=inc){
          if(this.list[j]<this.list[j-inc]){
            this.swap(j,j-inc);
          }else{
            break;
          }
        }

      }

    }

    public static void main(String arg[]){
      Scanner s= new Scanner(System.in);
      System.out.println("Please enter the size");
      int n = s.nextInt();
      Shell sh=new Shell(n);

      for(int i=0;i<n;i++)
      {
        sh.list[i]=s.nextInt();
      }

      sh.shell();
    }
}
