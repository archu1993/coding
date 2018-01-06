

package stack;
import java.io.*;
import java.util.*;
import java.util.Stack;

public class Intro {
    static void push(Stack stack)
    {
        System.out.println("Elements pushed : ");
        for(int i=0;i<5;i++)
        {
            stack.push(i);
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void stack_peek(Stack stack)
    {
       Integer element = (Integer) stack.peek();
       System.out.println("Top of stack : "+element);
    }
    static int pop(Stack st)
    {
        int y=(int) st.pop();
        return y;
    }
    static void search(Stack st,int x)
    {
        int pos=(int) st.search(x);
        if(pos==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element at position : "+pos);
    }
  public static void main(String args[])
  {
      Stack stack=new Stack();
      push(stack);
      stack_peek(stack);
      int x=pop(stack);
      System.out.println("Deleted item from stack : "+x);
      stack_peek(stack);
      search(stack,2);
      search(stack,100);
  }
}
