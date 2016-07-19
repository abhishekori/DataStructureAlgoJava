import java.util.*;
class Queue{

  static int MAX_SIZE=40;

  int[] elements;
  int headIndex=-1;
  int tailIndex=-1;


  public boolean isEmpty(){

    return this.headIndex==-1;

  }

public boolean isFull(){
int nextIndex=-8;
  try{
   nextIndex = (this.tailIndex+1) % this.elements.length;

  }catch(NullPointerException nullPonter){
     System.out.println(nullPonter+" yes");
  }



  return nextIndex==this.headIndex;

  }

public void enqueue(int data){

  if(this.isFull()){
  System.out.println("its full");
  }

 tailIndex=(tailIndex+1)%elements.length;
 elements[tailIndex] = data;

 if(headIndex==-1)
 {
  headIndex=tailIndex;
 }

 }

 public int dequeue(){
   if(this.isEmpty())
   {
     System.out.println("Its empty");
   }

   int data = elements[headIndex];

   headIndex=(headIndex+1)%elements.length;
   return data;
 }

 public static void main(String[] arg)
 {
   int ch,d,n;
   Queue q = new Queue();

   System.out.println("Please enter the choice \n 1: insert \n 2:remove");
   Scanner s=new Scanner(System.in);
   ch=s.nextInt();

   switch(ch){
     case 1:
     System.out.println("Please enter the size");
     n=s.nextInt();

            for(int i=0;i<n;i++)
            {
              q.enqueue(s.nextInt());
            }

     break;

     case 2:System.out.println(q.dequeue());
     break;

     default:System.out.println("Wrong choice");

   }
 }
}
