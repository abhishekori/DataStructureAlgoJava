import java.util.*;
public class MinStack {
  Stack<Integer> stack = new Stack();
  Stack<Integer> minStack = new Stack();

  public void push(int data) {
    int min = data;
    if(!minStack.isEmpty()){
      if(min>minStack.peek())
      {
        min=minStack.peek();
      }
    }
    stack.push(data);
    minStack.push(min);
  }

  public int pop() {
    minStack.pop();
    return stack.pop();
  }

  public int getMin() {
    return minStack.pop();
  }

  public static void main(String[] args) {
    
int i;
MinStack s=new MinStack();
if(args.length>0)
{
  for (i=0;i<args.length;i++ ) {

    s.push(Integer.parseInt(args[i]));
  }
System.out.println(s.getMin());
}else{
  System.out.println("please pass the values");
}


      // s.push(Integer.parseInt(args[1]));
      // s.push(Integer.parseInt(args[2]));
      // s.push(Integer.parseInt(args[3]));





  }
}
