
package stack;

import static java.lang.System.exit;

public class Stack {
        static int top;
        static int max=1000;
        static int s[]=new int [max];
        public static void push(int x)
        {
            if(top>=max)
            {
                System.out.print("Stack overflow");
                exit(1);
            }
            s[++top]=x;
                
        }
        public static int pop()
        {
            if(top<0)
            {
                System.out.println("Stack underflow");
                exit(1);
            }
            int y=s[top];
            top--;
            return y;
        }
    public static void main(String[] args) {
        push(10);
        push(30);
        push(50);
        push(100);
        int p=pop();
        int q=pop();
        pop();
        pop();
        
        System.out.print("Deleted items from stack : "+p+" "+q);
        System.out.println();;
        System.out.println("Top of stack :"+s[top]);
    }
    
}
